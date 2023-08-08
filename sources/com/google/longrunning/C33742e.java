package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.longrunning.e */
public interface C33742e extends C34417m1 {
    String getNextPageToken();

    ByteString getNextPageTokenBytes();

    Operation getOperations(int i);

    int getOperationsCount();

    List<Operation> getOperationsList();
}
