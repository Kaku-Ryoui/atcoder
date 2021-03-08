import java.io.File;

class del{
  public static void main(String args[]){
    File file = new File("C:\\Users\\398sa\\Desktop\\at\\at_a\\Main.class");

    if (file.exists()){
      if (file.delete()){
        System.out.println("ファイルを削除しました");
      }else{
        System.out.println("ファイルの削除に失敗しました");
      }
    }else{
      System.out.println("ファイルが見つかりません");
    }
  }
}
