package Model;



public class turisticPlaceModel{
	private int codeLocation;
    private int code;
    private int codeAvailability;
    private char description;
    private char name;
    private int codeOpinion;
    private int codeType;
    
    public turisticPlaceModel(int codeLocation, int code, int codeAvailability, char description, char name, int codeOpinion, int codeType) {
        this.codeLocation = codeLocation;
        this.code = code;
        this.codeAvailability = codeAvailability;
        this.description = description;
        this.name = name;
        this.codeOpinion = codeOpinion;
        this.codeType = codeType;
    }

    public int getCodeLocation() {
        return codeLocation;
    }

    public void setCodeLocation(int codeLocation) {
        this.codeLocation = codeLocation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCodeAvailability() {
        return codeAvailability;
    }

    public void setCodeAvailability(int codeAvailability) {
        this.codeAvailability = codeAvailability;
    }

    public char getDescription() {
        return description;
    }

    public void setDescription(char description) {
        this.description = description;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getCodeOpinion() {
        return codeOpinion;
    }

    public void setCodeOpinion(int codeOpinion) {
        this.codeOpinion = codeOpinion;
    }

    public int getCodeType() {
        return codeType;
    }

    public void setCodeType(int codeType) {
        this.codeType = codeType;
    }

    
}
