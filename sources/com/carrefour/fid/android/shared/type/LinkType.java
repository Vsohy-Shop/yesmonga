package com.carrefour.fid.android.shared.type;

import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/type/LinkType;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum LinkType {
    EXTERNAL("external"),
    INTERNAL("internal"),
    UNKNOWN(new String());
    
    @C12579k

    /* renamed from: a */
    public static final C28878a f70749a = null;
    @C12579k
    private final String value;

    @C11363r0({"SMAP\nLinkType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkType.kt\ncom/carrefour/fid/android/shared/type/LinkType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
    /* renamed from: com.carrefour.fid.android.shared.type.LinkType$a */
    public static final class C28878a {
        public /* synthetic */ C28878a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final LinkType mo84051a(@C12580l String str) {
            LinkType linkType;
            LinkType[] values = LinkType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    linkType = null;
                    break;
                }
                linkType = values[i];
                if (Intrinsics.areEqual((Object) linkType.mo84050q(), (Object) str)) {
                    break;
                }
                i++;
            }
            return linkType == null ? LinkType.UNKNOWN : linkType;
        }

        public C28878a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f70749a = new C28878a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    LinkType(String str) {
        this.value = str;
    }

    @C12579k
    /* renamed from: q */
    public final String mo84050q() {
        return this.value;
    }
}
