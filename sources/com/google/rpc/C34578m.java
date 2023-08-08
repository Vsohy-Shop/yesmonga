package com.google.rpc;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.rpc.m */
public interface C34578m extends C34417m1 {
    int getCode();

    Any getDetails(int i);

    int getDetailsCount();

    List<Any> getDetailsList();

    String getMessage();

    ByteString getMessageBytes();
}
