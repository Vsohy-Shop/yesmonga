package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.api.g */
public interface C32397g extends C34417m1 {
    boolean getAllowWithoutCredential();

    OAuthRequirements getOauth();

    AuthRequirement getRequirements(int i);

    int getRequirementsCount();

    List<AuthRequirement> getRequirementsList();

    String getSelector();

    ByteString getSelectorBytes();

    boolean hasOauth();
}
