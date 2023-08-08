package com.google.rpc;

import com.google.protobuf.C34417m1;
import com.google.rpc.BadRequest;
import java.util.List;

/* renamed from: com.google.rpc.a */
public interface C34545a extends C34417m1 {
    BadRequest.FieldViolation getFieldViolations(int i);

    int getFieldViolationsCount();

    List<BadRequest.FieldViolation> getFieldViolationsList();
}
