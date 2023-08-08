package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12199c;
import kotlinx.serialization.json.C12341a;
import kotlinx.serialization.json.DecodeSequenceMode;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.p */
public final class C12390p {

    /* renamed from: kotlinx.serialization.json.internal.p$a */
    public /* synthetic */ class C12391a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecodeSequenceMode.values().length];
            iArr[DecodeSequenceMode.WHITESPACE_SEPARATED.ordinal()] = 1;
            iArr[DecodeSequenceMode.ARRAY_WRAPPED.ordinal()] = 2;
            iArr[DecodeSequenceMode.AUTO_DETECT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @C12579k
    /* renamed from: a */
    public static final <T> Iterator<T> m50113a(@C12579k DecodeSequenceMode decodeSequenceMode, @C12579k C12341a aVar, @C12579k C12366d0 d0Var, @C12579k C12199c<T> cVar) {
        Intrinsics.checkNotNullParameter(decodeSequenceMode, "mode");
        Intrinsics.checkNotNullParameter(aVar, "json");
        Intrinsics.checkNotNullParameter(d0Var, "lexer");
        Intrinsics.checkNotNullParameter(cVar, "deserializer");
        int i = C12391a.$EnumSwitchMapping$0[m50114b(d0Var, decodeSequenceMode).ordinal()];
        if (i == 1) {
            return new C12392q(aVar, d0Var, cVar);
        }
        if (i == 2) {
            return new C12389o(aVar, d0Var, cVar);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.".toString());
    }

    /* renamed from: b */
    public static final DecodeSequenceMode m50114b(C12359a aVar, DecodeSequenceMode decodeSequenceMode) {
        int i = C12391a.$EnumSwitchMapping$0[decodeSequenceMode.ordinal()];
        if (i == 1) {
            return DecodeSequenceMode.WHITESPACE_SEPARATED;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            } else if (m50115c(aVar)) {
                return DecodeSequenceMode.ARRAY_WRAPPED;
            } else {
                return DecodeSequenceMode.WHITESPACE_SEPARATED;
            }
        } else if (m50115c(aVar)) {
            return DecodeSequenceMode.ARRAY_WRAPPED;
        } else {
            aVar.mo25456y((byte) 8);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: c */
    public static final boolean m50115c(C12359a aVar) {
        if (aVar.mo25420G() != 8) {
            return false;
        }
        aVar.mo25444m((byte) 8);
        return true;
    }
}
