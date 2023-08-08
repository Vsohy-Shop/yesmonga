package com.google.api;

import com.google.api.Monitoring;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.api.z0 */
public interface C32452z0 extends C34417m1 {
    Monitoring.MonitoringDestination getConsumerDestinations(int i);

    int getConsumerDestinationsCount();

    List<Monitoring.MonitoringDestination> getConsumerDestinationsList();

    Monitoring.MonitoringDestination getProducerDestinations(int i);

    int getProducerDestinationsCount();

    List<Monitoring.MonitoringDestination> getProducerDestinationsList();
}
