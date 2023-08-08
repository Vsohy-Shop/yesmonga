package com.carrefour.fid.android.domain.models.product.detail;

import com.carrefour.fid.android.domain.models.product.ProductPicture;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.detail.b */
public interface C38107b {
    @C12579k
    /* renamed from: a */
    String mo118719a();

    @C12579k
    /* renamed from: b */
    List<OfferDetail> mo118720b();

    @C12579k
    /* renamed from: c */
    String mo118721c();

    @C12580l
    /* renamed from: d */
    Double mo118722d();

    @C12579k
    /* renamed from: e */
    Map<PictureSize, List<ProductPicture>> mo118723e();

    @C12579k
    /* renamed from: f */
    List<String> mo118724f();

    @C12579k
    /* renamed from: g */
    String mo118725g();

    @C12579k
    String getBrand();

    @C12580l
    String getCategory();

    @C12579k
    String getDescription();

    @C12579k
    String getName();
}
