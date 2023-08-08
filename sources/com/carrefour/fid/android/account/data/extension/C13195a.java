package com.carrefour.fid.android.account.data.extension;

import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.data.extension.a */
public final class C13195a {
    /* renamed from: a */
    public static final boolean m57177a(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "<this>");
        return C13181d.m57146e(loginRepository.mo31354f());
    }

    /* renamed from: b */
    public static final boolean m57178b(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "<this>");
        return !C13181d.m57146e(loginRepository.mo31354f());
    }
}
