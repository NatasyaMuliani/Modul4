public class _1_MengaksesAnggotaKelas {
    public int nrp;
    public String nama;
    public void info(){
        System.out.println("ini siswa RPL Polbeng");
    }

    public static void main(String[] args) {
        _1_MengaksesAnggotaKelas it= new _1_MengaksesAnggotaKelas();
        it.nrp=5;
        it.nama="Andi";
        it.info();
    }
}
