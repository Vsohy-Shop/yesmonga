package com.google.rpc.context;

import com.google.protobuf.C34417m1;
import com.google.rpc.context.AttributeContext;

/* renamed from: com.google.rpc.context.a */
public interface C34567a extends C34417m1 {
    AttributeContext.Api getApi();

    AttributeContext.Peer getDestination();

    AttributeContext.Peer getOrigin();

    AttributeContext.Request getRequest();

    AttributeContext.Resource getResource();

    AttributeContext.C34556Response getResponse();

    AttributeContext.Peer getSource();

    boolean hasApi();

    boolean hasDestination();

    boolean hasOrigin();

    boolean hasRequest();

    boolean hasResource();

    boolean hasResponse();

    boolean hasSource();
}
