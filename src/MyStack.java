public	class	MyStack<E>	{
    private	static	final	int	INITIAL_SIZE	=	16;
    private	E[]	elements;
    private	int	count	=	0;
    public	MyStack()	{
        elements	=	(E[])	new	Object[INITIAL_SIZE];
    }
//    Phương thức push()
    public	void	push(E	e){
        ensureCapacity();
        elements[count++]	=	e;
    }
    private	void	ensureCapacity()	{
        if(count	>=	elements.length){
            E[]	newElements	=	(E[])	new	Object[elements.length	*	2	+	1];
            System.arraycopy(elements,	0,	newElements,	0,	count);
            elements	=	newElements;
        }
    }
//    Phương thức pop()
    public	E	pop(){
        if(count	==	0){
            throw	new	IndexOutOfBoundsException("Stack	is	empty");
        }
        E	e	=	elements[count	- 1];
        elements[count	- 1]	=	null;
        count--;
        return	e;
    }

    public boolean isEmpty() {
        return false;
    }
}