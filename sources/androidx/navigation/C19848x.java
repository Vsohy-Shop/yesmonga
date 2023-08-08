package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import androidx.preference.C19965r;
import com.google.firebase.installations.local.C33093b;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.x */
public class C19848x {
    @C12580l

    /* renamed from: a */
    public final Uri f50711a;
    @C12580l

    /* renamed from: b */
    public final String f50712b;
    @C12580l

    /* renamed from: c */
    public final String f50713c;

    /* renamed from: androidx.navigation.x$a */
    public static final class C19849a {
        @C12579k

        /* renamed from: d */
        public static final C19850a f50714d = new C19850a((DefaultConstructorMarker) null);
        @C12580l

        /* renamed from: a */
        public Uri f50715a;
        @C12580l

        /* renamed from: b */
        public String f50716b;
        @C12580l

        /* renamed from: c */
        public String f50717c;

        /* renamed from: androidx.navigation.x$a$a */
        public static final class C19850a {
            public /* synthetic */ C19850a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            @C11384m
            /* renamed from: a */
            public final C19849a mo58632a(@C12579k String str) {
                boolean z;
                Intrinsics.checkNotNullParameter(str, "action");
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C19849a aVar = new C19849a((DefaultConstructorMarker) null);
                    aVar.mo58629e(str);
                    return aVar;
                }
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
            }

            @C12579k
            @C11384m
            /* renamed from: b */
            public final C19849a mo58633b(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "mimeType");
                C19849a aVar = new C19849a((DefaultConstructorMarker) null);
                aVar.mo58630f(str);
                return aVar;
            }

            @C12579k
            @C11384m
            /* renamed from: c */
            public final C19849a mo58634c(@C12579k Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                C19849a aVar = new C19849a((DefaultConstructorMarker) null);
                aVar.mo58631g(uri);
                return aVar;
            }

            public C19850a() {
            }
        }

        public /* synthetic */ C19849a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public static final C19849a m92212b(@C12579k String str) {
            return f50714d.mo58632a(str);
        }

        @C12579k
        @C11384m
        /* renamed from: c */
        public static final C19849a m92213c(@C12579k String str) {
            return f50714d.mo58633b(str);
        }

        @C12579k
        @C11384m
        /* renamed from: d */
        public static final C19849a m92214d(@C12579k Uri uri) {
            return f50714d.mo58634c(uri);
        }

        @C12579k
        /* renamed from: a */
        public final C19848x mo58628a() {
            return new C19848x(this.f50715a, this.f50716b, this.f50717c);
        }

        @C12579k
        /* renamed from: e */
        public final C19849a mo58629e(@C12579k String str) {
            boolean z;
            Intrinsics.checkNotNullParameter(str, "action");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f50716b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
        }

        @C12579k
        /* renamed from: f */
        public final C19849a mo58630f(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "mimeType");
            if (new Regex("^[-\\w*.]+/[-\\w+*.]+$").mo23334k(str)) {
                this.f50717c = str;
                return this;
            }
            throw new IllegalArgumentException(("The given mimeType " + str + " does not match to required \"type/subtype\" format").toString());
        }

        @C12579k
        /* renamed from: g */
        public final C19849a mo58631g(@C12579k Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f50715a = uri;
            return this;
        }

        public C19849a() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C19848x(@C12580l Uri uri, @C12580l String str, @C12580l String str2) {
        this.f50711a = uri;
        this.f50712b = str;
        this.f50713c = str2;
    }

    @C12580l
    /* renamed from: a */
    public String mo58624a() {
        return this.f50712b;
    }

    @C12580l
    /* renamed from: b */
    public String mo58625b() {
        return this.f50713c;
    }

    @C12580l
    /* renamed from: c */
    public Uri mo58626c() {
        return this.f50711a;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append(C33093b.f80281i);
        if (mo58626c() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(mo58626c()));
        }
        if (mo58624a() != null) {
            sb.append(" action=");
            sb.append(mo58624a());
        }
        if (mo58625b() != null) {
            sb.append(" mimetype=");
            sb.append(mo58625b());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C19848x(@C12579k Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
    }
}
