package com.google.firebase.crashlytics.internal.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id */
    private final int f79278id;

    /* access modifiers changed from: public */
    DeliveryMechanism(int i) {
        this.f79278id = i;
    }

    /* renamed from: b */
    public static DeliveryMechanism m131946b(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: g */
    public int mo94847g() {
        return this.f79278id;
    }

    public String toString() {
        return Integer.toString(this.f79278id);
    }
}
