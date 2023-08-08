package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.rpc.c */
public interface C34547c extends C34417m1 {
    String getDetail();

    ByteString getDetailBytes();

    String getStackEntries(int i);

    ByteString getStackEntriesBytes(int i);

    int getStackEntriesCount();

    List<String> getStackEntriesList();
}
