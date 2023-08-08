package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.api.e0 */
public interface C32392e0 extends C34417m1 {
    String getContentType();

    ByteString getContentTypeBytes();

    ByteString getData();

    Any getExtensions(int i);

    int getExtensionsCount();

    List<Any> getExtensionsList();
}
