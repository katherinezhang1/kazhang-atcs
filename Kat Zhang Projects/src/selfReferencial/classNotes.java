package selfReferencial;

public class classNotes {

static int recursive(int i){
	if(i>0)
		return recursive(i-1)*i;
	else 
		return 1;
}
public static void main(String[] args){
	System.out.println(recursive(4));
}
}
