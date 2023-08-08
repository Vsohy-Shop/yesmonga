package com.carrefour.fid.android.various.domain.model;

import androidx.annotation.Keep;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12236c;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.encoding.C12241e;
import kotlinx.serialization.encoding.C12244g;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12327y;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0001\u0003\t\n\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence;", "", "delay", "", "getDelay", "()I", "Blocker", "Info", "Warning", "Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence$Blocker;", "Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence$Info;", "Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence$Warning;", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public interface AppMessageRecurrence {

    @Keep
    @C12439o
    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence$Blocker;", "Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence;", "Lkotlinx/serialization/g;", "serializer", "", "delay", "I", "getDelay", "()I", "<init>", "()V", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Blocker implements AppMessageRecurrence {
        private static final /* synthetic */ C11677z<C12248g<Object>> $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, C227871.f58348f);
        @C12579k
        public static final Blocker INSTANCE = new Blocker();
        private static final int delay = 0;

        private Blocker() {
        }

        private final /* synthetic */ C12248g get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public int getDelay() {
            return delay;
        }

        @C12579k
        public final C12248g<Blocker> serializer() {
            return get$cachedSerializer();
        }
    }

    @Keep
    @C12439o
    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence$Info;", "Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence;", "Lkotlinx/serialization/g;", "serializer", "", "delay", "I", "getDelay", "()I", "<init>", "()V", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Info implements AppMessageRecurrence {
        private static final /* synthetic */ C11677z<C12248g<Object>> $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, C227881.f58349f);
        @C12579k
        public static final Info INSTANCE = new Info();
        private static final int delay = 999;

        private Info() {
        }

        private final /* synthetic */ C12248g get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public int getDelay() {
            return delay;
        }

        @C12579k
        public final C12248g<Info> serializer() {
            return get$cachedSerializer();
        }
    }

    int getDelay();

    @Keep
    @C12439o
    @C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence$Warning;", "Lcom/carrefour/fid/android/various/domain/model/AppMessageRecurrence;", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "delay", "copy", "", "toString", "hashCode", "", "other", "", "equals", "I", "getDelay", "()I", "<init>", "(I)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(IILkotlinx/serialization/internal/n1;)V", "Companion", "a", "b", "various_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Warning implements AppMessageRecurrence {
        @C12579k
        public static final C22790b Companion = new C22790b((DefaultConstructorMarker) null);
        private final int delay;

        @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
        /* renamed from: com.carrefour.fid.android.various.domain.model.AppMessageRecurrence$Warning$a */
        public static final class C22789a implements C12327y<Warning> {
            @C12579k

            /* renamed from: a */
            public static final C22789a f58350a;

            /* renamed from: b */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f58351b;

            static {
                C22789a aVar = new C22789a();
                f58350a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.carrefour.fid.android.various.domain.model.AppMessageRecurrence.Warning", aVar, 1);
                pluginGeneratedSerialDescriptor.mo24966k("delay", false);
                f58351b = pluginGeneratedSerialDescriptor;
            }

            @C12579k
            /* renamed from: a */
            public Warning deserialize(@C12579k C12241e eVar) {
                int i;
                Intrinsics.checkNotNullParameter(eVar, "decoder");
                C12217f descriptor = getDescriptor();
                C12236c b = eVar.mo24875b(descriptor);
                int i2 = 1;
                if (b.mo24886p()) {
                    i = b.mo24880i(descriptor, 0);
                } else {
                    i = 0;
                    int i3 = 0;
                    while (i2 != 0) {
                        int o = b.mo24931o(descriptor);
                        if (o == -1) {
                            i2 = 0;
                        } else if (o == 0) {
                            i = b.mo24880i(descriptor, 0);
                            i3 |= 1;
                        } else {
                            throw new UnknownFieldException(o);
                        }
                    }
                    i2 = i3;
                }
                b.mo24876c(descriptor);
                return new Warning(i2, i, (C12295n1) null);
            }

            /* renamed from: b */
            public void serialize(@C12579k C12244g gVar, @C12579k Warning warning) {
                Intrinsics.checkNotNullParameter(gVar, "encoder");
                Intrinsics.checkNotNullParameter(warning, "value");
                C12217f descriptor = getDescriptor();
                C12239d b = gVar.mo24906b(descriptor);
                b.mo24927x(descriptor, 0, warning.getDelay());
                b.mo24907c(descriptor);
            }

            @C12579k
            public C12248g<?>[] childSerializers() {
                return new C12248g[]{C12276h0.f30067a};
            }

            @C12579k
            public C12217f getDescriptor() {
                return f58351b;
            }

            @C12579k
            public C12248g<?>[] typeParametersSerializers() {
                return C12327y.C12328a.m49635a(this);
            }
        }

        /* renamed from: com.carrefour.fid.android.various.domain.model.AppMessageRecurrence$Warning$b */
        public static final class C22790b {
            public /* synthetic */ C22790b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C12248g<Warning> mo67234a() {
                return C22789a.f58350a;
            }

            public C22790b() {
            }
        }

        public Warning(int i) {
            this.delay = i;
        }

        public static /* synthetic */ Warning copy$default(Warning warning, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = warning.delay;
            }
            return warning.copy(i);
        }

        public final int component1() {
            return this.delay;
        }

        @C12579k
        public final Warning copy(int i) {
            return new Warning(i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Warning) && this.delay == ((Warning) obj).delay;
        }

        public int getDelay() {
            return this.delay;
        }

        public int hashCode() {
            return Integer.hashCode(this.delay);
        }

        @C12579k
        public String toString() {
            int i = this.delay;
            return "Warning(delay=" + i + ")";
        }

        @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
        public /* synthetic */ Warning(int i, int i2, C12295n1 n1Var) {
            if (1 != (i & 1)) {
                C12261c1.m49256b(i, 1, C22789a.f58350a.getDescriptor());
            }
            this.delay = i2;
        }
    }
}
