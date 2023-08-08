package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.api.c1 */
public interface C32387c1 extends C34417m1 {
    String getContent();

    ByteString getContentBytes();

    String getName();

    ByteString getNameBytes();

    Page getSubpages(int i);

    int getSubpagesCount();

    List<Page> getSubpagesList();
}
