package codeGenerator;

public class CodeGeneratorFacade {
    public static Address newAddress(int num, varType varType, TypeAddress Type) {
        switch (Type) {
            case Direct:
                return new DirectAddress(num, varType);
            case Indirect:
                return new IndirectAddress(num, varType);
            case Immediate:
                return new ImmediateAddress(num, varType);
        }
        return new DirectAddress(num, varType);
    }
}
