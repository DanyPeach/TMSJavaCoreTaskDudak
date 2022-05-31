package by.TMS_Dudak.TaskPotiki.DzTask3;

public class Method {
    private String a = "a";
    private StringBuilder sb = new StringBuilder(a);

    public Method() {
    }

    public Method(StringBuilder sb) {
        this.sb = sb;
    }

    public synchronized void inc(){
        System.out.println("\nthis happening in " + Thread.currentThread().getName());
        for(int i = 0; i<10; i++){
            System.out.println(sb);
            if(i==9){
                sb.append(a);
            }
        }
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
