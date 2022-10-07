public class Pc{
    private String assetID;
    private String name;
    private String lcdName;
    private int ramSpaceMB , diskSizeGB;

    public Pc( String assetID , String name , String lcdName , int ramSpaceMB , int diskSizeGB ){
        this.assetID = assetID;
        this.name = name;
        this.lcdName = lcdName;
        this.ramSpaceMB = ramSpaceMB;
        this.diskSizeGB = diskSizeGB;
    }

    public Pc(Pc pc){
        this.assetID = pc.assetID;
        this.name = pc.name;
        this.lcdName = pc.lcdName;
        this.ramSpaceMB = pc.ramSpaceMB;
        this.diskSizeGB = pc.diskSizeGB;
    }
        public  void setassetID(String assetID) {
            this.assetID = assetID;
        }

        public String getassetID(){
            return assetID;
        }

        public void setname(String name) {
            this.name = name;            
        }
        public String getname() {
            return name;
        }

        public void setlcdName(String lcdName) {
            this.lcdName = lcdName;
        }

        public String getlcdName() {
            return lcdName;
        }

        public void setramSpaceMB(int ramSpaceMB) {
            this.ramSpaceMB = ramSpaceMB;
        }

        public int getramSpaceMB () {
            return ramSpaceMB;
        }

        public void setdisksize(int diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
        }

        public int getdisksize() {
            return diskSizeGB;
        }

        public String tostring(){
            return String.format("ASSET ID:%s\nNAME:%s\nLCD NAME:%s\nRAM SIZE:%d\nDISK SIZE:%d", assetID , name , lcdName , ramSpaceMB , diskSizeGB );
        }

        public boolean equals(Object o){
            Pc temp = (Pc)o;

            if(temp.name == this.name && temp.assetID == this.assetID && temp.lcdName == this.lcdName && temp.ramSpaceMB == this.ramSpaceMB && temp.diskSizeGB == this.diskSizeGB){
                return true;
            }
            else{
                return false;
            }

        }

}