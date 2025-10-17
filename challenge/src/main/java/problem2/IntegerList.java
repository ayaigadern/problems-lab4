package problem2;

public class IntegerList
{
    int[] list; //values in the list
    private int count;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        int count=0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++){
            list[i] = (int)(Math.random() * 100) + 1;
            count++;

        }

    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<count; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    // increaseSize function
    public void increaseSize(){
        int[] newArray= new int[list.length*2];
        for(int i=0;i<list.length;i++){
            newArray[i]=list[i];
        }
        list=newArray;
    }
    public void addElement(int newVal){
        if(count==list.length){
            increaseSize();
        }
        list[count]=newVal;
        count++;
    }
    public void removeFirst(int newVal){
        boolean found=false;
        count--;
        for( int i=0;i<count;i++){
            if(list[i]==newVal){
                found=true;
                for(int j=i;j<count;j++){
                    list[j]=list[j+1];
                }
                break;
            }
        }
        if(!found){
            count++;
            System.out.println("Value not found");
        }

    }
    public void removeAll(int newVal){
        boolean found=false;
        int numOfOccurence=0;
        for( int i=0;i<count;i++){
            if(list[i]==newVal){
                numOfOccurence++;
                found=true;
                for(int j=i;j<count;j++){
                    list[j]=list[j+1];
                }
            }
        }
        if(found){
            count-=numOfOccurence;
        }
        if(!found){
            System.out.println("Value not found");
        }

    }
}