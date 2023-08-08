package com.google.api;

import com.google.api.MetricDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.api.r0 */
public interface C32431r0 extends C34417m1 {
    String getDescription();

    ByteString getDescriptionBytes();

    String getDisplayName();

    ByteString getDisplayNameBytes();

    LabelDescriptor getLabels(int i);

    int getLabelsCount();

    List<LabelDescriptor> getLabelsList();

    LaunchStage getLaunchStage();

    int getLaunchStageValue();

    MetricDescriptor.MetricDescriptorMetadata getMetadata();

    MetricDescriptor.MetricKind getMetricKind();

    int getMetricKindValue();

    String getName();

    ByteString getNameBytes();

    String getType();

    ByteString getTypeBytes();

    String getUnit();

    ByteString getUnitBytes();

    MetricDescriptor.ValueType getValueType();

    int getValueTypeValue();

    boolean hasMetadata();
}
