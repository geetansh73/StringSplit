class stringsplit
{
public static void main(String g[])
{
String str="Java is a programming language123";
String arr[]=str.split("\\s");
System.out.println("Total no. of words: "+arr.length);
for(String i:arr)
{
System.out.println(i);
}
char arr1[]=str.toCharArray();
for(char i:arr1)
{
System.out.println(i);
}
System.out.println("Total no. of characters: "+arr1.length);
int number=0;
for(int i=0;i<arr1.length;i++)
{
if (arr1[i]=='1'||arr1[i]=='2'||arr1[i]=='3'||arr1[i]=='4'||arr1[i]=='5'||arr1[i]=='6'||arr1[i]=='7'||arr1[i]=='8'||arr1[i]=='9'||arr1[i]=='0')
{
number++;
}
}
System.out.println("Total no. of numbers: "+number);
int numberCount=0,alpha=0,special=0;
for(int i=0;i<str.length();i++)
{
if(Character.isDigit(str.charAt(i)))
{
numberCount++;
}
else if(Character.isAlphabetic(str.charAt(i)))
{
    alpha++;
}
else{
special++;
}

}
   System.out.println(numberCount+" "+alpha+" "+special); 
}
}