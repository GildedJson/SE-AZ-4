package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public abstract class Address {
    public int num;
    public TypeAddress Type;
    public varType varType;

    public Address(int num, varType varType, TypeAddress Type) {
        this.num = num;
        this.Type = Type;
        this.varType = varType;
    }

//    public Address(int num, varType varType) {
//        this.num = num;
//        this.Type = TypeAddress.Direct;
//        this.varType = varType;
//    }

    public abstract String toString();
}

class DirectAddress extends Address{
    public DirectAddress(int num, codeGenerator.varType varType) {
        super(num, varType, TypeAddress.Direct);
    }

    @Override
    public String toString() {
        return num + "";
    }
}

class IndirectAddress extends Address{
    public IndirectAddress(int num, codeGenerator.varType varType) {
        super(num, varType, TypeAddress.Indirect);
    }

    @Override
    public String toString() {
        return "@" + num;
    }
}

class ImmediateAddress extends Address{
    public ImmediateAddress(int num, codeGenerator.varType varType) {
        super(num, varType, TypeAddress.Immediate);
    }

    @Override
    public String toString() {
        return "#" + num;
    }
}