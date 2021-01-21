//Khai báo lớp ArrayList
public class ArrayList <E>{

}
//Khai báo lớp và interface generic
class	ClassName<T>	{
}
interface	InterfaceName<T>	{
}
//Khai báo lớp generic
class	GenericArrayList<T>	{
    private	static	final	int	INITIAL_SIZE	=	16;
    private		T[]	elements;
    private	int	count	=	0;
    public	GenericArrayList(){
        this.elements	=	(T[])new	Object[INITIAL_SIZE];
    }
    public	void	add(T	element){
        this.elements[count++]	=	element;
    }
}
//    Generic với nhiều kiểu dữ liệu
class	GenericMap<K,	V>{
}

//Phương thức generic
	class	GenericMethodDemo	{
    public	static	void	main(String[]	args	)	{
        Integer[]	integers	=	{1,	2,	3,	4,	5};
        String[]	strings	=	{"London",	"Paris",	"New	York",	"Austin"};
        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
    }
    public	static	<E>	void	print(E[]	list)	{
        for	(int	i	=	0;	i	<	list.length;	i++){
            System.out.print(list[i]	+	"	");
        }
        System.out.println();
    }
}

