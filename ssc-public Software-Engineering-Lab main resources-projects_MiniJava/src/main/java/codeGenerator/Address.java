package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public abstract class Address {
    private int num;
    private TypeAddress Type;
    private varType varType;

    public Address(int num, varType varType, TypeAddress Type) {
        this.setNum(num);
        this.setType(Type);
        this.setVarType(varType);
    }

//    public Address(int num, varType varType) {
//        this.num = num;
//        this.Type = TypeAddress.Direct;
//        this.varType = varType;
//    }

    public abstract String toString();

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public TypeAddress getType() {
        return Type;
    }

    public void setType(TypeAddress type) {
        Type = type;
    }

    public codeGenerator.varType getVarType() {
        return varType;
    }

    public void setVarType(codeGenerator.varType varType) {
        this.varType = varType;
    }
}

class DirectAddress extends Address{
    public DirectAddress(int num, codeGenerator.varType varType) {
        super(num, varType, TypeAddress.Direct);
    }

    @Override
    public String toString() {
        return getNum() + "";
    }
}

class IndirectAddress extends Address{
    public IndirectAddress(int num, codeGenerator.varType varType) {
        super(num, varType, TypeAddress.Indirect);
    }

    @Override
    public String toString() {
        return "@" + getNum();
    }
}

class ImmediateAddress extends Address{
    public ImmediateAddress(int num, codeGenerator.varType varType) {
        super(num, varType, TypeAddress.Immediate);
    }

    @Override
    public String toString() {
        return "#" + getNum();
    }
}