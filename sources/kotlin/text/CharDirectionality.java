package kotlin.text;

import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001c\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, mo22516d2 = {"Lkotlin/text/CharDirectionality;", "", "", "value", "I", "r", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "c", "d", "e", "f", "g", "v", "w", "x", "y", "z", "X", "Y", "Z", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum CharDirectionality {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    @C12579k

    /* renamed from: a */
    public static final C11591a f28827a = null;
    @C12579k

    /* renamed from: b */
    public static final C11677z<Map<Integer, CharDirectionality>> f28828b = null;
    private final int value;

    /* renamed from: kotlin.text.CharDirectionality$a */
    public static final class C11591a {
        public /* synthetic */ C11591a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Map<Integer, CharDirectionality> mo23309a() {
            return (Map) CharDirectionality.f28828b.getValue();
        }

        @C12579k
        /* renamed from: b */
        public final CharDirectionality mo23310b(int i) {
            CharDirectionality charDirectionality = mo23309a().get(Integer.valueOf(i));
            if (charDirectionality != null) {
                return charDirectionality;
            }
            throw new IllegalArgumentException("Directionality #" + i + " is not defined.");
        }

        public C11591a() {
        }
    }

    /* access modifiers changed from: public */
    static {
        f28827a = new C11591a((DefaultConstructorMarker) null);
        f28828b = C10864b0.m38748c(CharDirectionality$Companion$directionalityMap$2.f28839f);
    }

    /* access modifiers changed from: public */
    CharDirectionality(int i) {
        this.value = i;
    }

    /* renamed from: r */
    public final int mo23308r() {
        return this.value;
    }
}
