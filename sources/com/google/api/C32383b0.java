package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.api.b0 */
public interface C32383b0 extends C34417m1 {
    @Deprecated
    String getAliases(int i);

    @Deprecated
    ByteString getAliasesBytes(int i);

    @Deprecated
    int getAliasesCount();

    @Deprecated
    List<String> getAliasesList();

    boolean getAllowCors();

    String getFeatures(int i);

    ByteString getFeaturesBytes(int i);

    int getFeaturesCount();

    List<String> getFeaturesList();

    String getName();

    ByteString getNameBytes();

    String getTarget();

    ByteString getTargetBytes();
}
