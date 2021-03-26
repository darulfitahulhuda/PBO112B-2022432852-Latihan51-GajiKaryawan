package pbo112b.pkg2022432852.latihan51.gajikaryawan;

public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }

    public float tunjanganJabatan(String jabatan) {
        tunjanganJabatan = switch (jabatan) {
            case "Manager" -> 2000000;
            case "Kabag" -> 1000000;
            default -> 0;
        };

        return tunjanganJabatan;
    }

    public float tunjanganGolongan(int golongan) {
        switch (golongan) {
        case 1 -> tunjanganGolongan = 500000;
        case 2 -> tunjanganGolongan = 1000000;
        case 3 -> tunjanganGolongan = 1500000;
        default -> {
            }
        }
        return tunjanganGolongan;
    }

    public float gajiTotal() {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }

}
