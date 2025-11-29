import java.util.*;
public class rohan5 {
    static class Heap{
        ArrayList<Integer>al=new ArrayList<>();
        public void add(int data){
            //add at last idx
            al.add(data);

            int c=al.size()-1;  //child
            int p=(c-1)/2;      //parent

            while(al.get(c)<al.get(p)){
                //swap
                int temp=al.get(c);
                al.set(c,al.get(p));
                al.set(p,temp);

                c=p;
                p=(c-1)/2;
            }
    }

    //peek
    public int peek(){
        return al.get(0);
    }

    //heapify
    private void heapify(int i){
        int l=2*i+1;
        int r=2*i+2;
        int minidx=i;  //root

        if(l<al.size() && al.get(minidx)>al.get(l)){
            minidx=l;
        }
        if(r<al.size() && al.get(minidx)>al.get(r)){
            minidx=r;
        }

        if(minidx!=i){  //if root not min then fix
            //swap
            int temp=al.get(i);
            al.set(i,al.get(minidx));
            al.set(minidx,temp);

            heapify(minidx);  //to verify if no other issues are there
            
        }
    }
    //delete
    public int remove(){
        int data=al.get(0);  //peek val is minimum
        //swap 1st and last
        int temp=al.get(0);
        al.set(0,al.get(al.size()-1));
        al.set(al.size()-1,temp);

        //delete last
        al.remove(al.size()-1);

        //heapify
        heapify(0);
        return data;
    }

    //isEmpty
    public boolean isEmpty(){
        return al.size()==0;
    }
    }
    public static void main(String args[]){
        Heap h=new Heap();
        h.add(5);
        h.add(4);
        h.add(3);
        h.add(1);

        while(!h.isEmpty()){
            System.out.print(h.peek()+" ");
            h.remove();
        }
    }
}
