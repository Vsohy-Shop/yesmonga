package com.carrefour.fid.android.domain.models.delivery;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.domain.models.delivery.b */
public abstract class C38017b {

    /* renamed from: a */
    public final int f95826a;
    @C12579k

    /* renamed from: b */
    public final DeliveryCode f95827b;
    @C12579k

    /* renamed from: c */
    public final C38016a f95828c;
    @C12579k

    /* renamed from: d */
    public final C38016a f95829d;

    public /* synthetic */ C38017b(int i, DeliveryCode deliveryCode, C38016a aVar, C38016a aVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, deliveryCode, aVar, aVar2);
    }

    @C12579k
    /* renamed from: a */
    public DeliveryCode mo117633a() {
        return this.f95827b;
    }

    @C12579k
    /* renamed from: b */
    public C38016a mo117634b() {
        return this.f95829d;
    }

    @C12579k
    /* renamed from: c */
    public C38016a mo117635c() {
        return this.f95828c;
    }

    /* renamed from: d */
    public int mo117636d() {
        return this.f95826a;
    }

    public C38017b(int i, DeliveryCode deliveryCode, C38016a aVar, C38016a aVar2) {
        this.f95826a = i;
        this.f95827b = deliveryCode;
        this.f95828c = aVar;
        this.f95829d = aVar2;
    }
}
