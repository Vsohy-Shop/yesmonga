package kotlinx.serialization.internal;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.C12199c;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"<anonymous>", "T", "", "Tag", "invoke", "()Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class TaggedDecoder$decodeNullableSerializableElement$1 extends Lambda implements C11289a<T> {
    final /* synthetic */ C12199c<T> $deserializer;
    final /* synthetic */ T $previousValue;
    final /* synthetic */ TaggedDecoder<Tag> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaggedDecoder$decodeNullableSerializableElement$1(TaggedDecoder<Tag> taggedDecoder, C12199c<T> cVar, T t) {
        super(0);
        this.this$0 = taggedDecoder;
        this.$deserializer = cVar;
        this.$previousValue = t;
    }

    @C12580l
    public final T invoke() {
        if (this.this$0.mo24867D()) {
            return this.this$0.mo24977K(this.$deserializer, this.$previousValue);
        }
        return this.this$0.mo24881j();
    }
}
