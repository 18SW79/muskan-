class LogicalOperators{
	public static void main (String args[]){
	int num1=10, num2=20 ,num3=30;
	boolean result;
	result=(num1<num2)  ||  (num2>num1);
	System.out.println("RESULT:"+result);
	result=(num1>num2)  &&  (num3>num1);
	System.out.println("RESULT:"+result);
	}
}