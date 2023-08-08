package com.google.longrunning;

import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import com.google.rpc.Status;

/* renamed from: com.google.longrunning.g */
public interface C33744g extends C34417m1 {
    boolean getDone();

    Status getError();

    Any getMetadata();

    String getName();

    ByteString getNameBytes();

    Any getResponse();

    Operation.ResultCase getResultCase();

    boolean hasError();

    boolean hasMetadata();

    boolean hasResponse();
}
