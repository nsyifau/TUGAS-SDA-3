import java.util.LinkedList;

public class linkedlist1
{
    public static void main(String[] args) {
        LinkedList <String> nama_mahasiswa = new LinkedList<String>();
        LinkedList <String> no_bp = new LinkedList<String>();
        LinkedList <String> alamat = new LinkedList<String>();

        nama_mahasiswa.add("Nurul Syifa Utami");
        no_bp.add("2111523014");
        alamat.add("Komplek Berlindo Blok G");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Menambahkan Data Mahasiswa : ");
        //menambahkan nama mahasiswa
        nama_mahasiswa.addFirst("Angelia");
        nama_mahasiswa.add("Aura sabila");
        nama_mahasiswa.add("Hanna");
        nama_mahasiswa.addLast("Siti amilie");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
       
        //menambahkan nomor induk mahasiswa
        no_bp.addFirst("2111522003");
        no_bp.add("2111522004");
        no_bp.add("2111522002");
        no_bp.addLast("211152001");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        //menambahkan alamat mahasiswa
        alamat.addFirst("Jln. Melati No.1");
        alamat.add("Jln. Anggrek No.5");
        alamat.add("Jln. Anggrek No.7");
        alamat.addLast("Jln. Mawar No.15");
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Menghapus Data Mahasiswa : ");
        //menghapus nama mahasiswa
        nama_mahasiswa.removeFirst();
        nama_mahasiswa.remove();
        nama_mahasiswa.removeLast();
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        //menghapus nomor induk mahasiswa
        no_bp.removeFirst();
        no_bp.remove();
        no_bp.removeLast();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        //menghapus alamat mahsiswa
        alamat.removeFirst();
        alamat.remove();
        alamat.removeLast();
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Menyisipkan Data Mahasiswa : ");
        //menyisipkan nama mahasiswa
        nama_mahasiswa.set(0,"Azahra");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        //menyisipkan nomor induk mahasiswa
        no_bp.set(0,"2111522017");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        
        //menyisipkan alamat mahasiswa
        alamat.set(0,"Jln. Kamboja No.14");
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Mencari Data Mahasiswa : ");
        //mencari nama mahasiswa
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getFirst());
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.get(1));
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getLast());
        System.out.println("");

        //mencari nomor induk mahasiswa
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getFirst());
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.get(1));
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getLast());
        System.out.println("");

        //mencari alamat mahasiswa
        System.out.println("Alamat Mahasiswa : " +alamat.getFirst());
        System.out.println("Alamat Mahasiswa : " +alamat.get(1));
        System.out.println("Alamat Mahasiswa : " +alamat.getLast());
        System.out.println("");
    }
}