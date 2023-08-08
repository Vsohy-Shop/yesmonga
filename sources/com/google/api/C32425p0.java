package com.google.api;

import com.google.api.Logging;
import com.google.protobuf.C34417m1;
import java.util.List;

/* renamed from: com.google.api.p0 */
public interface C32425p0 extends C34417m1 {
    Logging.LoggingDestination getConsumerDestinations(int i);

    int getConsumerDestinationsCount();

    List<Logging.LoggingDestination> getConsumerDestinationsList();

    Logging.LoggingDestination getProducerDestinations(int i);

    int getProducerDestinationsCount();

    List<Logging.LoggingDestination> getProducerDestinationsList();
}
