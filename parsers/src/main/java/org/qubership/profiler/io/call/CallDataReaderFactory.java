package org.qubership.profiler.io.call;

public class CallDataReaderFactory {
    public static CallDataReader createReader(int fileFormat) {
        switch (fileFormat) {
            case 1:
                return new CallDataReader_01();
            case 2:
                return new CallDataReader_02();
            case 3:
                return new CallDataReader_03();
            case 4:
                return new CallDataReader_04();
            default:
                return new CallDataReader_00();
        }
    }

    public static ReactorCallReader createReactorReader(int fileFormat) {
        switch (fileFormat) {
            default:
                return new ReactorCallReader_00();
        }
    }
}
