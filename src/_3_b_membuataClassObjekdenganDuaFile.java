public class _3_b_membuataClassObjekdenganDuaFile {
    public static void main(String[] args) {
        _2_MembuatClassdanObjekDalamSatuFile dido=new _2_MembuatClassdanObjekDalamSatuFile();
        dido.nama="Dido";
        dido.umur=4;
        System.out.println("Nama :"+ dido.nama);
        System.out.println("Umur :" + dido.umur + "Tahun");
        dido.menangis();

        System.out.println();
        _2_MembuatClassdanObjekDalamSatuFile dodo= new _2_MembuatClassdanObjekDalamSatuFile("dodo");
        System.out.println("Nama :" +dodo.nama);
        System.out.println("Umur:" + dodo.umur + "Tahun");
        dodo.tertawa();

    }
}
