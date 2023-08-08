package com.carrefour.fid.android.data.entities.extension;

import com.carrefour.fid.android.data.entities.Amount;
import com.carrefour.fid.android.shared.extension.C28750d0;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAmount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Amount.kt\ncom/carrefour/fid/android/data/entities/extension/AmountKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,9:1\n1#2:10\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.extension.f */
public final class C36449f {
    /* renamed from: a */
    public static final double m149518a(@C12580l Amount amount) {
        if (amount != null) {
            return C28750d0.m119039a(amount.getUnscaledAmount(), amount.getScale());
        }
        return 0.0d;
    }

    @C12580l
    /* renamed from: b */
    public static final Double m149519b(@C12580l Amount amount) {
        if (amount != null) {
            return C28750d0.m119040b(amount.getUnscaledAmount(), amount.getScale());
        }
        return null;
    }
}
