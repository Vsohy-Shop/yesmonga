package com.urbanairship.android.layout.info;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.b */
public final class C35647b implements C35645a {
    @C12580l

    /* renamed from: a */
    public final String f88107a;

    public C35647b(@C12580l String str) {
        this.f88107a = str;
    }

    /* renamed from: e */
    public static /* synthetic */ C35647b m147034e(C35647b bVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.getContentDescription();
        }
        return bVar.mo106784d(str);
    }

    @C12580l
    /* renamed from: a */
    public final String mo106783a() {
        return getContentDescription();
    }

    @C12579k
    /* renamed from: d */
    public final C35647b mo106784d(@C12580l String str) {
        return new C35647b(str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35647b) && Intrinsics.areEqual((Object) getContentDescription(), (Object) ((C35647b) obj).getContentDescription());
    }

    @C12580l
    public String getContentDescription() {
        return this.f88107a;
    }

    public int hashCode() {
        if (getContentDescription() == null) {
            return 0;
        }
        return getContentDescription().hashCode();
    }

    @C12579k
    public String toString() {
        return "AccessibleInfo(contentDescription=" + getContentDescription() + ')';
    }
}
