package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.runtime.C8698y1;
import com.urbanairship.util.C9647e0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12196b;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\b\n\u0002\bp\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 è\u00012\u00020\u0001:\u0004é\u0001è\u0001Bß\u0004\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010Y\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$\u0012\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010$\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010(\u0012\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010$\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010-\u0012\u0010\b\u0002\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010$\u0012\u0010\b\u0002\u0010m\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010$\u0012\b\b\u0002\u0010n\u001a\u00020\u0019\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\u0019¢\u0006\u0006\bá\u0001\u0010â\u0001Bÿ\u0004\b\u0017\u0012\u0007\u0010ã\u0001\u001a\u00020t\u0012\u0007\u0010ä\u0001\u001a\u00020t\u0012\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010C\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010E\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010H\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010K\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010L\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010N\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010P\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010Q\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010S\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010U\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010V\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010W\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010X\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0001\u0010Y\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$\u0012\u0010\b\u0001\u0010Z\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010$\u0012\n\b\u0001\u0010[\u001a\u0004\u0018\u00010(\u0012\u0010\b\u0001\u0010\\\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010$\u0012\n\b\u0001\u0010]\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010^\u001a\u0004\u0018\u00010-\u0012\n\b\u0001\u0010_\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010`\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010a\u001a\u0004\u0018\u00010-\u0012\n\b\u0001\u0010b\u001a\u0004\u0018\u00010-\u0012\n\b\u0001\u0010c\u001a\u0004\u0018\u00010-\u0012\n\b\u0001\u0010d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010e\u001a\u0004\u0018\u00010-\u0012\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010g\u001a\u0004\u0018\u00010-\u0012\n\b\u0001\u0010h\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0001\u0010i\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$\u0012\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010k\u001a\u0004\u0018\u00010-\u0012\u0010\b\u0001\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010$\u0012\u0010\b\u0001\u0010m\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010$\u0012\b\b\u0001\u0010n\u001a\u00020\u0019\u0012\n\b\u0001\u0010o\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010p\u001a\u0004\u0018\u00010\u0019\u0012\n\u0010æ\u0001\u001a\u0005\u0018\u00010å\u0001¢\u0006\u0006\bá\u0001\u0010ç\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010!\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010$HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010(HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010$HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010-HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010-HÆ\u0003J\u0012\u00108\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b8\u0010\u001bJ\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$HÆ\u0003J\u0012\u0010:\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b:\u0010\u001bJ\u000b\u0010;\u001a\u0004\u0018\u00010-HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010$HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010$HÆ\u0003J\t\u0010?\u001a\u00020\u0019HÆ\u0003J\u0012\u0010@\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b@\u0010\u001bJ\u0012\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bA\u0010\u001bJæ\u0004\u0010q\u001a\u00020\u00002\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010Y\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$2\u0010\b\u0002\u0010Z\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010$2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010(2\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010$2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010i\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010k\u001a\u0004\u0018\u00010-2\u0010\b\u0002\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010$2\u0010\b\u0002\u0010m\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010$2\b\b\u0002\u0010n\u001a\u00020\u00192\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\bq\u0010rJ\t\u0010s\u001a\u00020\tHÖ\u0001J\t\u0010u\u001a\u00020tHÖ\u0001J\u0013\u0010w\u001a\u00020\u00192\b\u0010v\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010B\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bB\u0010x\u0012\u0004\b{\u0010|\u001a\u0004\by\u0010zR\"\u0010C\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u0010x\u0012\u0004\b~\u0010|\u001a\u0004\b}\u0010zR#\u0010D\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0013\n\u0004\bD\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0004\b\u0010zR$\u0010E\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bE\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR$\u0010F\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bF\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR$\u0010G\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bG\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR$\u0010H\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bH\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR$\u0010I\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bI\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR$\u0010J\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bJ\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR$\u0010K\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bK\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR$\u0010L\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bL\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR$\u0010M\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bM\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR&\u0010N\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0016\n\u0005\bN\u0010\u0001\u0012\u0005\b\u0001\u0010|\u001a\u0006\b\u0001\u0010\u0001R$\u0010O\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bO\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR%\u0010P\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0015\n\u0005\bP\u0010\u0001\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010\u001bR$\u0010Q\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bQ\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR$\u0010R\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bR\u0010x\u0012\u0005\b\u0001\u0010|\u001a\u0005\b\u0001\u0010zR$\u0010S\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bS\u0010x\u0012\u0005\b¡\u0001\u0010|\u001a\u0005\b \u0001\u0010zR$\u0010T\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bT\u0010x\u0012\u0005\b£\u0001\u0010|\u001a\u0005\b¢\u0001\u0010zR$\u0010U\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bU\u0010x\u0012\u0005\b¥\u0001\u0010|\u001a\u0005\b¤\u0001\u0010zR$\u0010V\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0014\n\u0005\bV\u0010\u0001\u0012\u0005\b¦\u0001\u0010|\u001a\u0004\bV\u0010\u001bR%\u0010W\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0015\n\u0005\bW\u0010\u0001\u0012\u0005\b¨\u0001\u0010|\u001a\u0005\b§\u0001\u0010\u001bR$\u0010X\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0014\n\u0005\bX\u0010\u0001\u0012\u0005\b©\u0001\u0010|\u001a\u0004\bX\u0010\u001bR,\u0010Y\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$8\u0006X\u0004¢\u0006\u0016\n\u0005\bY\u0010ª\u0001\u0012\u0005\b­\u0001\u0010|\u001a\u0006\b«\u0001\u0010¬\u0001R,\u0010Z\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010$8\u0006X\u0004¢\u0006\u0016\n\u0005\bZ\u0010ª\u0001\u0012\u0005\b¯\u0001\u0010|\u001a\u0006\b®\u0001\u0010¬\u0001R&\u0010[\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0016\n\u0005\b[\u0010°\u0001\u0012\u0005\b³\u0001\u0010|\u001a\u0006\b±\u0001\u0010²\u0001R,\u0010\\\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010$8\u0006X\u0004¢\u0006\u0016\n\u0005\b\\\u0010ª\u0001\u0012\u0005\bµ\u0001\u0010|\u001a\u0006\b´\u0001\u0010¬\u0001R$\u0010]\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\b]\u0010x\u0012\u0005\b·\u0001\u0010|\u001a\u0005\b¶\u0001\u0010zR&\u0010^\u001a\u0004\u0018\u00010-8\u0006X\u0004¢\u0006\u0016\n\u0005\b^\u0010¸\u0001\u0012\u0005\b»\u0001\u0010|\u001a\u0006\b¹\u0001\u0010º\u0001R$\u0010_\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\b_\u0010x\u0012\u0005\b½\u0001\u0010|\u001a\u0005\b¼\u0001\u0010zR$\u0010`\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\b`\u0010x\u0012\u0005\b¿\u0001\u0010|\u001a\u0005\b¾\u0001\u0010zR&\u0010a\u001a\u0004\u0018\u00010-8\u0006X\u0004¢\u0006\u0016\n\u0005\ba\u0010¸\u0001\u0012\u0005\bÁ\u0001\u0010|\u001a\u0006\bÀ\u0001\u0010º\u0001R&\u0010b\u001a\u0004\u0018\u00010-8\u0006X\u0004¢\u0006\u0016\n\u0005\bb\u0010¸\u0001\u0012\u0005\bÃ\u0001\u0010|\u001a\u0006\bÂ\u0001\u0010º\u0001R&\u0010c\u001a\u0004\u0018\u00010-8\u0006X\u0004¢\u0006\u0016\n\u0005\bc\u0010¸\u0001\u0012\u0005\bÅ\u0001\u0010|\u001a\u0006\bÄ\u0001\u0010º\u0001R$\u0010d\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bd\u0010x\u0012\u0005\bÇ\u0001\u0010|\u001a\u0005\bÆ\u0001\u0010zR&\u0010e\u001a\u0004\u0018\u00010-8\u0006X\u0004¢\u0006\u0016\n\u0005\be\u0010¸\u0001\u0012\u0005\bÉ\u0001\u0010|\u001a\u0006\bÈ\u0001\u0010º\u0001R$\u0010f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0014\n\u0004\bf\u0010x\u0012\u0005\bË\u0001\u0010|\u001a\u0005\bÊ\u0001\u0010zR&\u0010g\u001a\u0004\u0018\u00010-8\u0006X\u0004¢\u0006\u0016\n\u0005\bg\u0010¸\u0001\u0012\u0005\bÍ\u0001\u0010|\u001a\u0006\bÌ\u0001\u0010º\u0001R%\u0010h\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0015\n\u0005\bh\u0010\u0001\u0012\u0005\bÏ\u0001\u0010|\u001a\u0005\bÎ\u0001\u0010\u001bR,\u0010i\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010$8\u0006X\u0004¢\u0006\u0016\n\u0005\bi\u0010ª\u0001\u0012\u0005\bÑ\u0001\u0010|\u001a\u0006\bÐ\u0001\u0010¬\u0001R$\u0010j\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0014\n\u0005\bj\u0010\u0001\u0012\u0005\bÒ\u0001\u0010|\u001a\u0004\bj\u0010\u001bR&\u0010k\u001a\u0004\u0018\u00010-8\u0006X\u0004¢\u0006\u0016\n\u0005\bk\u0010¸\u0001\u0012\u0005\bÔ\u0001\u0010|\u001a\u0006\bÓ\u0001\u0010º\u0001R,\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010$8\u0006X\u0004¢\u0006\u0016\n\u0005\bl\u0010ª\u0001\u0012\u0005\bÖ\u0001\u0010|\u001a\u0006\bÕ\u0001\u0010¬\u0001R,\u0010m\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010$8\u0006X\u0004¢\u0006\u0016\n\u0005\bm\u0010ª\u0001\u0012\u0005\bØ\u0001\u0010|\u001a\u0006\b×\u0001\u0010¬\u0001R$\u0010n\u001a\u00020\u00198\u0006X\u0004¢\u0006\u0016\n\u0005\bn\u0010Ù\u0001\u0012\u0005\bÜ\u0001\u0010|\u001a\u0006\bÚ\u0001\u0010Û\u0001R%\u0010o\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0015\n\u0005\bo\u0010\u0001\u0012\u0005\bÞ\u0001\u0010|\u001a\u0005\bÝ\u0001\u0010\u001bR%\u0010p\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0015\n\u0005\bp\u0010\u0001\u0012\u0005\bà\u0001\u0010|\u001a\u0005\bß\u0001\u0010\u001b¨\u0006ê\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonDetailedFacility;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalServiceInformation;", "component13", "component14", "", "component15", "()Ljava/lang/Boolean;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "", "component24", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDeliveryCityZone;", "component25", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFees;", "component26", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDeliveryFee;", "component27", "component28", "Ljava/math/BigDecimal;", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit1;", "component44", "component45", "component46", "component47", "id", "facilityServiceId", "name", "label", "status", "storeFormat", "storeService", "openingDate", "description", "type", "weight", "category", "additionalServiceInformation", "promise", "bffIsExpress", "minefiCode", "metiReference", "wlecFormat", "wlecService", "wording", "isPVFR", "hasVariableWeight", "isFranchised", "deliveryZones", "deliveryCityZones", "fees", "deliveryFees", "storeLoyaltyPreparator", "productMaxQuantity", "bcpBannerDesc", "bcpBanner", "minOrderAmount", "preparationPrice", "preparatorMinimumAmount", "preparatorCnuf", "freePreparationThreshold", "googleMapStoreURL", "maxOrderWeighting", "paymentOnSiteActivated", "paymentChoice", "isEWalletLoyaltyActivated", "freeDeliveryThreshold", "passDays", "limits", "returnableShoppingBag", "yieldEligible", "facilityHasInStoreService", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalServiceInformation;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFees;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonDetailedFacility;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getFacilityServiceId", "getFacilityServiceId$annotations", "getName", "getName$annotations", "getLabel", "getLabel$annotations", "getStatus", "getStatus$annotations", "getStoreFormat", "getStoreFormat$annotations", "getStoreService", "getStoreService$annotations", "getOpeningDate", "getOpeningDate$annotations", "getDescription", "getDescription$annotations", "getType", "getType$annotations", "getWeight", "getWeight$annotations", "getCategory", "getCategory$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalServiceInformation;", "getAdditionalServiceInformation", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalServiceInformation;", "getAdditionalServiceInformation$annotations", "getPromise", "getPromise$annotations", "Ljava/lang/Boolean;", "getBffIsExpress", "getBffIsExpress$annotations", "getMinefiCode", "getMinefiCode$annotations", "getMetiReference", "getMetiReference$annotations", "getWlecFormat", "getWlecFormat$annotations", "getWlecService", "getWlecService$annotations", "getWording", "getWording$annotations", "isPVFR$annotations", "getHasVariableWeight", "getHasVariableWeight$annotations", "isFranchised$annotations", "Ljava/util/List;", "getDeliveryZones", "()Ljava/util/List;", "getDeliveryZones$annotations", "getDeliveryCityZones", "getDeliveryCityZones$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFees;", "getFees", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFees;", "getFees$annotations", "getDeliveryFees", "getDeliveryFees$annotations", "getStoreLoyaltyPreparator", "getStoreLoyaltyPreparator$annotations", "Ljava/math/BigDecimal;", "getProductMaxQuantity", "()Ljava/math/BigDecimal;", "getProductMaxQuantity$annotations", "getBcpBannerDesc", "getBcpBannerDesc$annotations", "getBcpBanner", "getBcpBanner$annotations", "getMinOrderAmount", "getMinOrderAmount$annotations", "getPreparationPrice", "getPreparationPrice$annotations", "getPreparatorMinimumAmount", "getPreparatorMinimumAmount$annotations", "getPreparatorCnuf", "getPreparatorCnuf$annotations", "getFreePreparationThreshold", "getFreePreparationThreshold$annotations", "getGoogleMapStoreURL", "getGoogleMapStoreURL$annotations", "getMaxOrderWeighting", "getMaxOrderWeighting$annotations", "getPaymentOnSiteActivated", "getPaymentOnSiteActivated$annotations", "getPaymentChoice", "getPaymentChoice$annotations", "isEWalletLoyaltyActivated$annotations", "getFreeDeliveryThreshold", "getFreeDeliveryThreshold$annotations", "getPassDays", "getPassDays$annotations", "getLimits", "getLimits$annotations", "Z", "getReturnableShoppingBag", "()Z", "getReturnableShoppingBag$annotations", "getYieldEligible", "getYieldEligible$annotations", "getFacilityHasInStoreService", "getFacilityHasInStoreService$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalServiceInformation;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFees;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "seen2", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffAdditionalServiceInformation;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceFees;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCommonDetailedFacility {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffAdditionalServiceInformation additionalServiceInformation;
    @C12580l
    private final String bcpBanner;
    @C12580l
    private final String bcpBannerDesc;
    @C12580l
    private final Boolean bffIsExpress;
    @C12580l
    private final String category;
    @C12580l
    private final List<BffDeliveryCityZone> deliveryCityZones;
    @C12580l
    private final List<BffDeliveryFee> deliveryFees;
    @C12580l
    private final List<String> deliveryZones;
    @C12580l
    private final String description;
    @C12580l
    private final Boolean facilityHasInStoreService;
    @C12580l
    private final String facilityServiceId;
    @C12580l
    private final BffServiceFees fees;
    @C12580l
    private final BigDecimal freeDeliveryThreshold;
    @C12580l
    private final BigDecimal freePreparationThreshold;
    @C12580l
    private final String googleMapStoreURL;
    @C12580l
    private final Boolean hasVariableWeight;
    @C12580l

    /* renamed from: id */
    private final String f100675id;
    @C12580l
    private final Boolean isEWalletLoyaltyActivated;
    @C12580l
    private final Boolean isFranchised;
    @C12580l
    private final Boolean isPVFR;
    @C12580l
    private final String label;
    @C12580l
    private final List<BffLimit1> limits;
    @C12580l
    private final BigDecimal maxOrderWeighting;
    @C12580l
    private final String metiReference;
    @C12580l
    private final BigDecimal minOrderAmount;
    @C12580l
    private final String minefiCode;
    @C12580l
    private final String name;
    @C12580l
    private final String openingDate;
    @C12580l
    private final List<Boolean> passDays;
    @C12580l
    private final List<String> paymentChoice;
    @C12580l
    private final Boolean paymentOnSiteActivated;
    @C12580l
    private final BigDecimal preparationPrice;
    @C12580l
    private final String preparatorCnuf;
    @C12580l
    private final BigDecimal preparatorMinimumAmount;
    @C12580l
    private final BigDecimal productMaxQuantity;
    @C12580l
    private final String promise;
    private final boolean returnableShoppingBag;
    @C12580l
    private final String status;
    @C12580l
    private final String storeFormat;
    @C12580l
    private final String storeLoyaltyPreparator;
    @C12580l
    private final String storeService;
    @C12580l
    private final String type;
    @C12580l
    private final String weight;
    @C12580l
    private final String wlecFormat;
    @C12580l
    private final String wlecService;
    @C12580l
    private final String wording;
    @C12580l
    private final Boolean yieldEligible;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonDetailedFacility$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonDetailedFacility;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCommonDetailedFacility> serializer() {
            return BffCommonDetailedFacility$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C12310s1 s1Var = C12310s1.f30117a;
        Class<BigDecimal> cls = BigDecimal.class;
        $childSerializers = new C12248g[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C12269f(s1Var), new C12269f(BffDeliveryCityZone$$serializer.INSTANCE), null, new C12269f(BffDeliveryFee$$serializer.INSTANCE), null, new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), null, null, new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), null, new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), null, new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), null, new C12269f(s1Var), null, new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), new C12269f(C12278i.f30070a), new C12269f(BffLimit1$$serializer.INSTANCE), null, null, null};
    }

    public BffCommonDetailedFacility() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BffAdditionalServiceInformation) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (List) null, (List) null, (BffServiceFees) null, (List) null, (String) null, (BigDecimal) null, (String) null, (String) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (String) null, (BigDecimal) null, (String) null, (BigDecimal) null, (Boolean) null, (List) null, (Boolean) null, (BigDecimal) null, (List) null, (List) null, false, (Boolean) null, (Boolean) null, -1, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCommonDetailedFacility copy$default(BffCommonDetailedFacility bffCommonDetailedFacility, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, BffAdditionalServiceInformation bffAdditionalServiceInformation, String str13, Boolean bool, String str14, String str15, String str16, String str17, String str18, Boolean bool2, Boolean bool3, Boolean bool4, List list, List list2, BffServiceFees bffServiceFees, List list3, String str19, BigDecimal bigDecimal, String str20, String str21, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str22, BigDecimal bigDecimal5, String str23, BigDecimal bigDecimal6, Boolean bool5, List list4, Boolean bool6, BigDecimal bigDecimal7, List list5, List list6, boolean z, Boolean bool7, Boolean bool8, int i, int i2, Object obj) {
        BffCommonDetailedFacility bffCommonDetailedFacility2 = bffCommonDetailedFacility;
        int i3 = i;
        int i4 = i2;
        return bffCommonDetailedFacility.copy((i3 & 1) != 0 ? bffCommonDetailedFacility2.f100675id : str, (i3 & 2) != 0 ? bffCommonDetailedFacility2.facilityServiceId : str2, (i3 & 4) != 0 ? bffCommonDetailedFacility2.name : str3, (i3 & 8) != 0 ? bffCommonDetailedFacility2.label : str4, (i3 & 16) != 0 ? bffCommonDetailedFacility2.status : str5, (i3 & 32) != 0 ? bffCommonDetailedFacility2.storeFormat : str6, (i3 & 64) != 0 ? bffCommonDetailedFacility2.storeService : str7, (i3 & 128) != 0 ? bffCommonDetailedFacility2.openingDate : str8, (i3 & 256) != 0 ? bffCommonDetailedFacility2.description : str9, (i3 & 512) != 0 ? bffCommonDetailedFacility2.type : str10, (i3 & 1024) != 0 ? bffCommonDetailedFacility2.weight : str11, (i3 & 2048) != 0 ? bffCommonDetailedFacility2.category : str12, (i3 & 4096) != 0 ? bffCommonDetailedFacility2.additionalServiceInformation : bffAdditionalServiceInformation, (i3 & 8192) != 0 ? bffCommonDetailedFacility2.promise : str13, (i3 & 16384) != 0 ? bffCommonDetailedFacility2.bffIsExpress : bool, (i3 & 32768) != 0 ? bffCommonDetailedFacility2.minefiCode : str14, (i3 & 65536) != 0 ? bffCommonDetailedFacility2.metiReference : str15, (i3 & 131072) != 0 ? bffCommonDetailedFacility2.wlecFormat : str16, (i3 & 262144) != 0 ? bffCommonDetailedFacility2.wlecService : str17, (i3 & 524288) != 0 ? bffCommonDetailedFacility2.wording : str18, (i3 & 1048576) != 0 ? bffCommonDetailedFacility2.isPVFR : bool2, (i3 & 2097152) != 0 ? bffCommonDetailedFacility2.hasVariableWeight : bool3, (i3 & 4194304) != 0 ? bffCommonDetailedFacility2.isFranchised : bool4, (i3 & 8388608) != 0 ? bffCommonDetailedFacility2.deliveryZones : list, (i3 & 16777216) != 0 ? bffCommonDetailedFacility2.deliveryCityZones : list2, (i3 & C9647e0.f26435a) != 0 ? bffCommonDetailedFacility2.fees : bffServiceFees, (i3 & C8698y1.f23302n) != 0 ? bffCommonDetailedFacility2.deliveryFees : list3, (i3 & C8698y1.f23301m) != 0 ? bffCommonDetailedFacility2.storeLoyaltyPreparator : str19, (i3 & 268435456) != 0 ? bffCommonDetailedFacility2.productMaxQuantity : bigDecimal, (i3 & 536870912) != 0 ? bffCommonDetailedFacility2.bcpBannerDesc : str20, (i3 & 1073741824) != 0 ? bffCommonDetailedFacility2.bcpBanner : str21, (i3 & Integer.MIN_VALUE) != 0 ? bffCommonDetailedFacility2.minOrderAmount : bigDecimal2, (i4 & 1) != 0 ? bffCommonDetailedFacility2.preparationPrice : bigDecimal3, (i4 & 2) != 0 ? bffCommonDetailedFacility2.preparatorMinimumAmount : bigDecimal4, (i4 & 4) != 0 ? bffCommonDetailedFacility2.preparatorCnuf : str22, (i4 & 8) != 0 ? bffCommonDetailedFacility2.freePreparationThreshold : bigDecimal5, (i4 & 16) != 0 ? bffCommonDetailedFacility2.googleMapStoreURL : str23, (i4 & 32) != 0 ? bffCommonDetailedFacility2.maxOrderWeighting : bigDecimal6, (i4 & 64) != 0 ? bffCommonDetailedFacility2.paymentOnSiteActivated : bool5, (i4 & 128) != 0 ? bffCommonDetailedFacility2.paymentChoice : list4, (i4 & 256) != 0 ? bffCommonDetailedFacility2.isEWalletLoyaltyActivated : bool6, (i4 & 512) != 0 ? bffCommonDetailedFacility2.freeDeliveryThreshold : bigDecimal7, (i4 & 1024) != 0 ? bffCommonDetailedFacility2.passDays : list5, (i4 & 2048) != 0 ? bffCommonDetailedFacility2.limits : list6, (i4 & 4096) != 0 ? bffCommonDetailedFacility2.returnableShoppingBag : z, (i4 & 8192) != 0 ? bffCommonDetailedFacility2.yieldEligible : bool7, (i4 & 16384) != 0 ? bffCommonDetailedFacility2.facilityHasInStoreService : bool8);
    }

    @C12438n("additional_service_information")
    public static /* synthetic */ void getAdditionalServiceInformation$annotations() {
    }

    @C12438n("bcp_banner")
    public static /* synthetic */ void getBcpBanner$annotations() {
    }

    @C12438n("bcp_banner_desc")
    public static /* synthetic */ void getBcpBannerDesc$annotations() {
    }

    @C12438n("bff_is_express")
    public static /* synthetic */ void getBffIsExpress$annotations() {
    }

    @C12438n("category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    @C12438n("delivery_city_zones")
    public static /* synthetic */ void getDeliveryCityZones$annotations() {
    }

    @C12438n("delivery_fees")
    public static /* synthetic */ void getDeliveryFees$annotations() {
    }

    @C12438n("delivery_zones")
    public static /* synthetic */ void getDeliveryZones$annotations() {
    }

    @C12438n("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @C12438n("facility_has_in_store_service")
    public static /* synthetic */ void getFacilityHasInStoreService$annotations() {
    }

    @C12438n("facility_service_id")
    public static /* synthetic */ void getFacilityServiceId$annotations() {
    }

    @C12438n("fees")
    public static /* synthetic */ void getFees$annotations() {
    }

    @C12196b
    @C12438n("free_delivery_threshold")
    public static /* synthetic */ void getFreeDeliveryThreshold$annotations() {
    }

    @C12196b
    @C12438n("free_preparation_threshold")
    public static /* synthetic */ void getFreePreparationThreshold$annotations() {
    }

    @C12438n("google_map_store_URL")
    public static /* synthetic */ void getGoogleMapStoreURL$annotations() {
    }

    @C12438n("has_variable_weight")
    public static /* synthetic */ void getHasVariableWeight$annotations() {
    }

    @C12438n("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @C12438n("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @C12438n("limits")
    public static /* synthetic */ void getLimits$annotations() {
    }

    @C12196b
    @C12438n("max_order_weighting")
    public static /* synthetic */ void getMaxOrderWeighting$annotations() {
    }

    @C12438n("meti_reference")
    public static /* synthetic */ void getMetiReference$annotations() {
    }

    @C12196b
    @C12438n("min_order_amount")
    public static /* synthetic */ void getMinOrderAmount$annotations() {
    }

    @C12438n("minefi_code")
    public static /* synthetic */ void getMinefiCode$annotations() {
    }

    @C12438n("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @C12438n("opening_date")
    public static /* synthetic */ void getOpeningDate$annotations() {
    }

    @C12438n("pass_days")
    public static /* synthetic */ void getPassDays$annotations() {
    }

    @C12438n("payment_choice")
    public static /* synthetic */ void getPaymentChoice$annotations() {
    }

    @C12438n("payment_on_site_activated")
    public static /* synthetic */ void getPaymentOnSiteActivated$annotations() {
    }

    @C12196b
    @C12438n("preparation_price")
    public static /* synthetic */ void getPreparationPrice$annotations() {
    }

    @C12438n("preparator_cnuf")
    public static /* synthetic */ void getPreparatorCnuf$annotations() {
    }

    @C12196b
    @C12438n("preparator_minimum_amount")
    public static /* synthetic */ void getPreparatorMinimumAmount$annotations() {
    }

    @C12196b
    @C12438n("product_max_quantity")
    public static /* synthetic */ void getProductMaxQuantity$annotations() {
    }

    @C12438n("promise")
    public static /* synthetic */ void getPromise$annotations() {
    }

    @C12438n("returnable_shopping_bag")
    public static /* synthetic */ void getReturnableShoppingBag$annotations() {
    }

    @C12438n("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @C12438n("store_format")
    public static /* synthetic */ void getStoreFormat$annotations() {
    }

    @C12438n("store_loyalty_preparator")
    public static /* synthetic */ void getStoreLoyaltyPreparator$annotations() {
    }

    @C12438n("store_service")
    public static /* synthetic */ void getStoreService$annotations() {
    }

    @C12438n("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @C12438n("weight")
    public static /* synthetic */ void getWeight$annotations() {
    }

    @C12438n("wlec_format")
    public static /* synthetic */ void getWlecFormat$annotations() {
    }

    @C12438n("wlec_service")
    public static /* synthetic */ void getWlecService$annotations() {
    }

    @C12438n("wording")
    public static /* synthetic */ void getWording$annotations() {
    }

    @C12438n("yield_eligible")
    public static /* synthetic */ void getYieldEligible$annotations() {
    }

    @C12438n("is_e_wallet_loyalty_activated")
    public static /* synthetic */ void isEWalletLoyaltyActivated$annotations() {
    }

    @C12438n("is_franchised")
    public static /* synthetic */ void isFranchised$annotations() {
    }

    @C12438n("is_PVFR")
    public static /* synthetic */ void isPVFR$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCommonDetailedFacility bffCommonDetailedFacility, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCommonDetailedFacility.f100675id != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffCommonDetailedFacility.f100675id);
        }
        if (dVar.mo24897A(fVar, 1) || bffCommonDetailedFacility.facilityServiceId != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffCommonDetailedFacility.facilityServiceId);
        }
        if (dVar.mo24897A(fVar, 2) || bffCommonDetailedFacility.name != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffCommonDetailedFacility.name);
        }
        if (dVar.mo24897A(fVar, 3) || bffCommonDetailedFacility.label != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffCommonDetailedFacility.label);
        }
        if (dVar.mo24897A(fVar, 4) || bffCommonDetailedFacility.status != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffCommonDetailedFacility.status);
        }
        if (dVar.mo24897A(fVar, 5) || bffCommonDetailedFacility.storeFormat != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffCommonDetailedFacility.storeFormat);
        }
        if (dVar.mo24897A(fVar, 6) || bffCommonDetailedFacility.storeService != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffCommonDetailedFacility.storeService);
        }
        if (dVar.mo24897A(fVar, 7) || bffCommonDetailedFacility.openingDate != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffCommonDetailedFacility.openingDate);
        }
        if (dVar.mo24897A(fVar, 8) || bffCommonDetailedFacility.description != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffCommonDetailedFacility.description);
        }
        if (dVar.mo24897A(fVar, 9) || bffCommonDetailedFacility.type != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffCommonDetailedFacility.type);
        }
        if (dVar.mo24897A(fVar, 10) || bffCommonDetailedFacility.weight != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffCommonDetailedFacility.weight);
        }
        if (dVar.mo24897A(fVar, 11) || bffCommonDetailedFacility.category != null) {
            dVar.mo24912i(fVar, 11, C12310s1.f30117a, bffCommonDetailedFacility.category);
        }
        if (dVar.mo24897A(fVar, 12) || bffCommonDetailedFacility.additionalServiceInformation != null) {
            dVar.mo24912i(fVar, 12, BffAdditionalServiceInformation$$serializer.INSTANCE, bffCommonDetailedFacility.additionalServiceInformation);
        }
        if (dVar.mo24897A(fVar, 13) || bffCommonDetailedFacility.promise != null) {
            dVar.mo24912i(fVar, 13, C12310s1.f30117a, bffCommonDetailedFacility.promise);
        }
        if (dVar.mo24897A(fVar, 14) || bffCommonDetailedFacility.bffIsExpress != null) {
            dVar.mo24912i(fVar, 14, C12278i.f30070a, bffCommonDetailedFacility.bffIsExpress);
        }
        if (dVar.mo24897A(fVar, 15) || bffCommonDetailedFacility.minefiCode != null) {
            dVar.mo24912i(fVar, 15, C12310s1.f30117a, bffCommonDetailedFacility.minefiCode);
        }
        if (dVar.mo24897A(fVar, 16) || bffCommonDetailedFacility.metiReference != null) {
            dVar.mo24912i(fVar, 16, C12310s1.f30117a, bffCommonDetailedFacility.metiReference);
        }
        if (dVar.mo24897A(fVar, 17) || bffCommonDetailedFacility.wlecFormat != null) {
            dVar.mo24912i(fVar, 17, C12310s1.f30117a, bffCommonDetailedFacility.wlecFormat);
        }
        if (dVar.mo24897A(fVar, 18) || bffCommonDetailedFacility.wlecService != null) {
            dVar.mo24912i(fVar, 18, C12310s1.f30117a, bffCommonDetailedFacility.wlecService);
        }
        if (dVar.mo24897A(fVar, 19) || bffCommonDetailedFacility.wording != null) {
            dVar.mo24912i(fVar, 19, C12310s1.f30117a, bffCommonDetailedFacility.wording);
        }
        if (dVar.mo24897A(fVar, 20) || bffCommonDetailedFacility.isPVFR != null) {
            dVar.mo24912i(fVar, 20, C12278i.f30070a, bffCommonDetailedFacility.isPVFR);
        }
        if (dVar.mo24897A(fVar, 21) || bffCommonDetailedFacility.hasVariableWeight != null) {
            dVar.mo24912i(fVar, 21, C12278i.f30070a, bffCommonDetailedFacility.hasVariableWeight);
        }
        if (dVar.mo24897A(fVar, 22) || bffCommonDetailedFacility.isFranchised != null) {
            dVar.mo24912i(fVar, 22, C12278i.f30070a, bffCommonDetailedFacility.isFranchised);
        }
        if (dVar.mo24897A(fVar, 23) || bffCommonDetailedFacility.deliveryZones != null) {
            dVar.mo24912i(fVar, 23, gVarArr[23], bffCommonDetailedFacility.deliveryZones);
        }
        if (dVar.mo24897A(fVar, 24) || bffCommonDetailedFacility.deliveryCityZones != null) {
            dVar.mo24912i(fVar, 24, gVarArr[24], bffCommonDetailedFacility.deliveryCityZones);
        }
        if (dVar.mo24897A(fVar, 25) || bffCommonDetailedFacility.fees != null) {
            dVar.mo24912i(fVar, 25, BffServiceFees$$serializer.INSTANCE, bffCommonDetailedFacility.fees);
        }
        if (dVar.mo24897A(fVar, 26) || bffCommonDetailedFacility.deliveryFees != null) {
            dVar.mo24912i(fVar, 26, gVarArr[26], bffCommonDetailedFacility.deliveryFees);
        }
        if (dVar.mo24897A(fVar, 27) || bffCommonDetailedFacility.storeLoyaltyPreparator != null) {
            dVar.mo24912i(fVar, 27, C12310s1.f30117a, bffCommonDetailedFacility.storeLoyaltyPreparator);
        }
        if (dVar.mo24897A(fVar, 28) || bffCommonDetailedFacility.productMaxQuantity != null) {
            dVar.mo24912i(fVar, 28, gVarArr[28], bffCommonDetailedFacility.productMaxQuantity);
        }
        if (dVar.mo24897A(fVar, 29) || bffCommonDetailedFacility.bcpBannerDesc != null) {
            dVar.mo24912i(fVar, 29, C12310s1.f30117a, bffCommonDetailedFacility.bcpBannerDesc);
        }
        if (dVar.mo24897A(fVar, 30) || bffCommonDetailedFacility.bcpBanner != null) {
            dVar.mo24912i(fVar, 30, C12310s1.f30117a, bffCommonDetailedFacility.bcpBanner);
        }
        if (dVar.mo24897A(fVar, 31) || bffCommonDetailedFacility.minOrderAmount != null) {
            dVar.mo24912i(fVar, 31, gVarArr[31], bffCommonDetailedFacility.minOrderAmount);
        }
        if (dVar.mo24897A(fVar, 32) || bffCommonDetailedFacility.preparationPrice != null) {
            dVar.mo24912i(fVar, 32, gVarArr[32], bffCommonDetailedFacility.preparationPrice);
        }
        if (dVar.mo24897A(fVar, 33) || bffCommonDetailedFacility.preparatorMinimumAmount != null) {
            dVar.mo24912i(fVar, 33, gVarArr[33], bffCommonDetailedFacility.preparatorMinimumAmount);
        }
        if (dVar.mo24897A(fVar, 34) || bffCommonDetailedFacility.preparatorCnuf != null) {
            dVar.mo24912i(fVar, 34, C12310s1.f30117a, bffCommonDetailedFacility.preparatorCnuf);
        }
        if (dVar.mo24897A(fVar, 35) || bffCommonDetailedFacility.freePreparationThreshold != null) {
            dVar.mo24912i(fVar, 35, gVarArr[35], bffCommonDetailedFacility.freePreparationThreshold);
        }
        if (dVar.mo24897A(fVar, 36) || bffCommonDetailedFacility.googleMapStoreURL != null) {
            dVar.mo24912i(fVar, 36, C12310s1.f30117a, bffCommonDetailedFacility.googleMapStoreURL);
        }
        if (dVar.mo24897A(fVar, 37) || bffCommonDetailedFacility.maxOrderWeighting != null) {
            dVar.mo24912i(fVar, 37, gVarArr[37], bffCommonDetailedFacility.maxOrderWeighting);
        }
        if (dVar.mo24897A(fVar, 38) || bffCommonDetailedFacility.paymentOnSiteActivated != null) {
            dVar.mo24912i(fVar, 38, C12278i.f30070a, bffCommonDetailedFacility.paymentOnSiteActivated);
        }
        if (dVar.mo24897A(fVar, 39) || bffCommonDetailedFacility.paymentChoice != null) {
            dVar.mo24912i(fVar, 39, gVarArr[39], bffCommonDetailedFacility.paymentChoice);
        }
        if (dVar.mo24897A(fVar, 40) || bffCommonDetailedFacility.isEWalletLoyaltyActivated != null) {
            dVar.mo24912i(fVar, 40, C12278i.f30070a, bffCommonDetailedFacility.isEWalletLoyaltyActivated);
        }
        if (dVar.mo24897A(fVar, 41) || bffCommonDetailedFacility.freeDeliveryThreshold != null) {
            dVar.mo24912i(fVar, 41, gVarArr[41], bffCommonDetailedFacility.freeDeliveryThreshold);
        }
        if (dVar.mo24897A(fVar, 42) || bffCommonDetailedFacility.passDays != null) {
            dVar.mo24912i(fVar, 42, gVarArr[42], bffCommonDetailedFacility.passDays);
        }
        if (dVar.mo24897A(fVar, 43) || bffCommonDetailedFacility.limits != null) {
            dVar.mo24912i(fVar, 43, gVarArr[43], bffCommonDetailedFacility.limits);
        }
        if (dVar.mo24897A(fVar, 44) || bffCommonDetailedFacility.returnableShoppingBag) {
            dVar.mo24928y(fVar, 44, bffCommonDetailedFacility.returnableShoppingBag);
        }
        if (dVar.mo24897A(fVar, 45) || bffCommonDetailedFacility.yieldEligible != null) {
            dVar.mo24912i(fVar, 45, C12278i.f30070a, bffCommonDetailedFacility.yieldEligible);
        }
        if (dVar.mo24897A(fVar, 46) || bffCommonDetailedFacility.facilityHasInStoreService != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 46, C12278i.f30070a, bffCommonDetailedFacility.facilityHasInStoreService);
        }
    }

    @C12580l
    public final String component1() {
        return this.f100675id;
    }

    @C12580l
    public final String component10() {
        return this.type;
    }

    @C12580l
    public final String component11() {
        return this.weight;
    }

    @C12580l
    public final String component12() {
        return this.category;
    }

    @C12580l
    public final BffAdditionalServiceInformation component13() {
        return this.additionalServiceInformation;
    }

    @C12580l
    public final String component14() {
        return this.promise;
    }

    @C12580l
    public final Boolean component15() {
        return this.bffIsExpress;
    }

    @C12580l
    public final String component16() {
        return this.minefiCode;
    }

    @C12580l
    public final String component17() {
        return this.metiReference;
    }

    @C12580l
    public final String component18() {
        return this.wlecFormat;
    }

    @C12580l
    public final String component19() {
        return this.wlecService;
    }

    @C12580l
    public final String component2() {
        return this.facilityServiceId;
    }

    @C12580l
    public final String component20() {
        return this.wording;
    }

    @C12580l
    public final Boolean component21() {
        return this.isPVFR;
    }

    @C12580l
    public final Boolean component22() {
        return this.hasVariableWeight;
    }

    @C12580l
    public final Boolean component23() {
        return this.isFranchised;
    }

    @C12580l
    public final List<String> component24() {
        return this.deliveryZones;
    }

    @C12580l
    public final List<BffDeliveryCityZone> component25() {
        return this.deliveryCityZones;
    }

    @C12580l
    public final BffServiceFees component26() {
        return this.fees;
    }

    @C12580l
    public final List<BffDeliveryFee> component27() {
        return this.deliveryFees;
    }

    @C12580l
    public final String component28() {
        return this.storeLoyaltyPreparator;
    }

    @C12580l
    public final BigDecimal component29() {
        return this.productMaxQuantity;
    }

    @C12580l
    public final String component3() {
        return this.name;
    }

    @C12580l
    public final String component30() {
        return this.bcpBannerDesc;
    }

    @C12580l
    public final String component31() {
        return this.bcpBanner;
    }

    @C12580l
    public final BigDecimal component32() {
        return this.minOrderAmount;
    }

    @C12580l
    public final BigDecimal component33() {
        return this.preparationPrice;
    }

    @C12580l
    public final BigDecimal component34() {
        return this.preparatorMinimumAmount;
    }

    @C12580l
    public final String component35() {
        return this.preparatorCnuf;
    }

    @C12580l
    public final BigDecimal component36() {
        return this.freePreparationThreshold;
    }

    @C12580l
    public final String component37() {
        return this.googleMapStoreURL;
    }

    @C12580l
    public final BigDecimal component38() {
        return this.maxOrderWeighting;
    }

    @C12580l
    public final Boolean component39() {
        return this.paymentOnSiteActivated;
    }

    @C12580l
    public final String component4() {
        return this.label;
    }

    @C12580l
    public final List<String> component40() {
        return this.paymentChoice;
    }

    @C12580l
    public final Boolean component41() {
        return this.isEWalletLoyaltyActivated;
    }

    @C12580l
    public final BigDecimal component42() {
        return this.freeDeliveryThreshold;
    }

    @C12580l
    public final List<Boolean> component43() {
        return this.passDays;
    }

    @C12580l
    public final List<BffLimit1> component44() {
        return this.limits;
    }

    public final boolean component45() {
        return this.returnableShoppingBag;
    }

    @C12580l
    public final Boolean component46() {
        return this.yieldEligible;
    }

    @C12580l
    public final Boolean component47() {
        return this.facilityHasInStoreService;
    }

    @C12580l
    public final String component5() {
        return this.status;
    }

    @C12580l
    public final String component6() {
        return this.storeFormat;
    }

    @C12580l
    public final String component7() {
        return this.storeService;
    }

    @C12580l
    public final String component8() {
        return this.openingDate;
    }

    @C12580l
    public final String component9() {
        return this.description;
    }

    @C12579k
    public final BffCommonDetailedFacility copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l BffAdditionalServiceInformation bffAdditionalServiceInformation, @C12580l String str13, @C12580l Boolean bool, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12580l List<String> list, @C12580l List<BffDeliveryCityZone> list2, @C12580l BffServiceFees bffServiceFees, @C12580l List<BffDeliveryFee> list3, @C12580l String str19, @C12580l BigDecimal bigDecimal, @C12580l String str20, @C12580l String str21, @C12580l BigDecimal bigDecimal2, @C12580l BigDecimal bigDecimal3, @C12580l BigDecimal bigDecimal4, @C12580l String str22, @C12580l BigDecimal bigDecimal5, @C12580l String str23, @C12580l BigDecimal bigDecimal6, @C12580l Boolean bool5, @C12580l List<String> list4, @C12580l Boolean bool6, @C12580l BigDecimal bigDecimal7, @C12580l List<Boolean> list5, @C12580l List<BffLimit1> list6, boolean z, @C12580l Boolean bool7, @C12580l Boolean bool8) {
        return new BffCommonDetailedFacility(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, bffAdditionalServiceInformation, str13, bool, str14, str15, str16, str17, str18, bool2, bool3, bool4, list, list2, bffServiceFees, list3, str19, bigDecimal, str20, str21, bigDecimal2, bigDecimal3, bigDecimal4, str22, bigDecimal5, str23, bigDecimal6, bool5, list4, bool6, bigDecimal7, list5, list6, z, bool7, bool8);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCommonDetailedFacility)) {
            return false;
        }
        BffCommonDetailedFacility bffCommonDetailedFacility = (BffCommonDetailedFacility) obj;
        return Intrinsics.areEqual((Object) this.f100675id, (Object) bffCommonDetailedFacility.f100675id) && Intrinsics.areEqual((Object) this.facilityServiceId, (Object) bffCommonDetailedFacility.facilityServiceId) && Intrinsics.areEqual((Object) this.name, (Object) bffCommonDetailedFacility.name) && Intrinsics.areEqual((Object) this.label, (Object) bffCommonDetailedFacility.label) && Intrinsics.areEqual((Object) this.status, (Object) bffCommonDetailedFacility.status) && Intrinsics.areEqual((Object) this.storeFormat, (Object) bffCommonDetailedFacility.storeFormat) && Intrinsics.areEqual((Object) this.storeService, (Object) bffCommonDetailedFacility.storeService) && Intrinsics.areEqual((Object) this.openingDate, (Object) bffCommonDetailedFacility.openingDate) && Intrinsics.areEqual((Object) this.description, (Object) bffCommonDetailedFacility.description) && Intrinsics.areEqual((Object) this.type, (Object) bffCommonDetailedFacility.type) && Intrinsics.areEqual((Object) this.weight, (Object) bffCommonDetailedFacility.weight) && Intrinsics.areEqual((Object) this.category, (Object) bffCommonDetailedFacility.category) && Intrinsics.areEqual((Object) this.additionalServiceInformation, (Object) bffCommonDetailedFacility.additionalServiceInformation) && Intrinsics.areEqual((Object) this.promise, (Object) bffCommonDetailedFacility.promise) && Intrinsics.areEqual((Object) this.bffIsExpress, (Object) bffCommonDetailedFacility.bffIsExpress) && Intrinsics.areEqual((Object) this.minefiCode, (Object) bffCommonDetailedFacility.minefiCode) && Intrinsics.areEqual((Object) this.metiReference, (Object) bffCommonDetailedFacility.metiReference) && Intrinsics.areEqual((Object) this.wlecFormat, (Object) bffCommonDetailedFacility.wlecFormat) && Intrinsics.areEqual((Object) this.wlecService, (Object) bffCommonDetailedFacility.wlecService) && Intrinsics.areEqual((Object) this.wording, (Object) bffCommonDetailedFacility.wording) && Intrinsics.areEqual((Object) this.isPVFR, (Object) bffCommonDetailedFacility.isPVFR) && Intrinsics.areEqual((Object) this.hasVariableWeight, (Object) bffCommonDetailedFacility.hasVariableWeight) && Intrinsics.areEqual((Object) this.isFranchised, (Object) bffCommonDetailedFacility.isFranchised) && Intrinsics.areEqual((Object) this.deliveryZones, (Object) bffCommonDetailedFacility.deliveryZones) && Intrinsics.areEqual((Object) this.deliveryCityZones, (Object) bffCommonDetailedFacility.deliveryCityZones) && Intrinsics.areEqual((Object) this.fees, (Object) bffCommonDetailedFacility.fees) && Intrinsics.areEqual((Object) this.deliveryFees, (Object) bffCommonDetailedFacility.deliveryFees) && Intrinsics.areEqual((Object) this.storeLoyaltyPreparator, (Object) bffCommonDetailedFacility.storeLoyaltyPreparator) && Intrinsics.areEqual((Object) this.productMaxQuantity, (Object) bffCommonDetailedFacility.productMaxQuantity) && Intrinsics.areEqual((Object) this.bcpBannerDesc, (Object) bffCommonDetailedFacility.bcpBannerDesc) && Intrinsics.areEqual((Object) this.bcpBanner, (Object) bffCommonDetailedFacility.bcpBanner) && Intrinsics.areEqual((Object) this.minOrderAmount, (Object) bffCommonDetailedFacility.minOrderAmount) && Intrinsics.areEqual((Object) this.preparationPrice, (Object) bffCommonDetailedFacility.preparationPrice) && Intrinsics.areEqual((Object) this.preparatorMinimumAmount, (Object) bffCommonDetailedFacility.preparatorMinimumAmount) && Intrinsics.areEqual((Object) this.preparatorCnuf, (Object) bffCommonDetailedFacility.preparatorCnuf) && Intrinsics.areEqual((Object) this.freePreparationThreshold, (Object) bffCommonDetailedFacility.freePreparationThreshold) && Intrinsics.areEqual((Object) this.googleMapStoreURL, (Object) bffCommonDetailedFacility.googleMapStoreURL) && Intrinsics.areEqual((Object) this.maxOrderWeighting, (Object) bffCommonDetailedFacility.maxOrderWeighting) && Intrinsics.areEqual((Object) this.paymentOnSiteActivated, (Object) bffCommonDetailedFacility.paymentOnSiteActivated) && Intrinsics.areEqual((Object) this.paymentChoice, (Object) bffCommonDetailedFacility.paymentChoice) && Intrinsics.areEqual((Object) this.isEWalletLoyaltyActivated, (Object) bffCommonDetailedFacility.isEWalletLoyaltyActivated) && Intrinsics.areEqual((Object) this.freeDeliveryThreshold, (Object) bffCommonDetailedFacility.freeDeliveryThreshold) && Intrinsics.areEqual((Object) this.passDays, (Object) bffCommonDetailedFacility.passDays) && Intrinsics.areEqual((Object) this.limits, (Object) bffCommonDetailedFacility.limits) && this.returnableShoppingBag == bffCommonDetailedFacility.returnableShoppingBag && Intrinsics.areEqual((Object) this.yieldEligible, (Object) bffCommonDetailedFacility.yieldEligible) && Intrinsics.areEqual((Object) this.facilityHasInStoreService, (Object) bffCommonDetailedFacility.facilityHasInStoreService);
    }

    @C12580l
    public final BffAdditionalServiceInformation getAdditionalServiceInformation() {
        return this.additionalServiceInformation;
    }

    @C12580l
    public final String getBcpBanner() {
        return this.bcpBanner;
    }

    @C12580l
    public final String getBcpBannerDesc() {
        return this.bcpBannerDesc;
    }

    @C12580l
    public final Boolean getBffIsExpress() {
        return this.bffIsExpress;
    }

    @C12580l
    public final String getCategory() {
        return this.category;
    }

    @C12580l
    public final List<BffDeliveryCityZone> getDeliveryCityZones() {
        return this.deliveryCityZones;
    }

    @C12580l
    public final List<BffDeliveryFee> getDeliveryFees() {
        return this.deliveryFees;
    }

    @C12580l
    public final List<String> getDeliveryZones() {
        return this.deliveryZones;
    }

    @C12580l
    public final String getDescription() {
        return this.description;
    }

    @C12580l
    public final Boolean getFacilityHasInStoreService() {
        return this.facilityHasInStoreService;
    }

    @C12580l
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    @C12580l
    public final BffServiceFees getFees() {
        return this.fees;
    }

    @C12580l
    public final BigDecimal getFreeDeliveryThreshold() {
        return this.freeDeliveryThreshold;
    }

    @C12580l
    public final BigDecimal getFreePreparationThreshold() {
        return this.freePreparationThreshold;
    }

    @C12580l
    public final String getGoogleMapStoreURL() {
        return this.googleMapStoreURL;
    }

    @C12580l
    public final Boolean getHasVariableWeight() {
        return this.hasVariableWeight;
    }

    @C12580l
    public final String getId() {
        return this.f100675id;
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final List<BffLimit1> getLimits() {
        return this.limits;
    }

    @C12580l
    public final BigDecimal getMaxOrderWeighting() {
        return this.maxOrderWeighting;
    }

    @C12580l
    public final String getMetiReference() {
        return this.metiReference;
    }

    @C12580l
    public final BigDecimal getMinOrderAmount() {
        return this.minOrderAmount;
    }

    @C12580l
    public final String getMinefiCode() {
        return this.minefiCode;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final String getOpeningDate() {
        return this.openingDate;
    }

    @C12580l
    public final List<Boolean> getPassDays() {
        return this.passDays;
    }

    @C12580l
    public final List<String> getPaymentChoice() {
        return this.paymentChoice;
    }

    @C12580l
    public final Boolean getPaymentOnSiteActivated() {
        return this.paymentOnSiteActivated;
    }

    @C12580l
    public final BigDecimal getPreparationPrice() {
        return this.preparationPrice;
    }

    @C12580l
    public final String getPreparatorCnuf() {
        return this.preparatorCnuf;
    }

    @C12580l
    public final BigDecimal getPreparatorMinimumAmount() {
        return this.preparatorMinimumAmount;
    }

    @C12580l
    public final BigDecimal getProductMaxQuantity() {
        return this.productMaxQuantity;
    }

    @C12580l
    public final String getPromise() {
        return this.promise;
    }

    public final boolean getReturnableShoppingBag() {
        return this.returnableShoppingBag;
    }

    @C12580l
    public final String getStatus() {
        return this.status;
    }

    @C12580l
    public final String getStoreFormat() {
        return this.storeFormat;
    }

    @C12580l
    public final String getStoreLoyaltyPreparator() {
        return this.storeLoyaltyPreparator;
    }

    @C12580l
    public final String getStoreService() {
        return this.storeService;
    }

    @C12580l
    public final String getType() {
        return this.type;
    }

    @C12580l
    public final String getWeight() {
        return this.weight;
    }

    @C12580l
    public final String getWlecFormat() {
        return this.wlecFormat;
    }

    @C12580l
    public final String getWlecService() {
        return this.wlecService;
    }

    @C12580l
    public final String getWording() {
        return this.wording;
    }

    @C12580l
    public final Boolean getYieldEligible() {
        return this.yieldEligible;
    }

    public int hashCode() {
        String str = this.f100675id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.facilityServiceId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.label;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.storeFormat;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.storeService;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.openingDate;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.description;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.type;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.weight;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.category;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BffAdditionalServiceInformation bffAdditionalServiceInformation = this.additionalServiceInformation;
        int hashCode13 = (hashCode12 + (bffAdditionalServiceInformation == null ? 0 : bffAdditionalServiceInformation.hashCode())) * 31;
        String str13 = this.promise;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.bffIsExpress;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str14 = this.minefiCode;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.metiReference;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.wlecFormat;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.wlecService;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.wording;
        int hashCode20 = (hashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool2 = this.isPVFR;
        int hashCode21 = (hashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasVariableWeight;
        int hashCode22 = (hashCode21 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isFranchised;
        int hashCode23 = (hashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list = this.deliveryZones;
        int hashCode24 = (hashCode23 + (list == null ? 0 : list.hashCode())) * 31;
        List<BffDeliveryCityZone> list2 = this.deliveryCityZones;
        int hashCode25 = (hashCode24 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BffServiceFees bffServiceFees = this.fees;
        int hashCode26 = (hashCode25 + (bffServiceFees == null ? 0 : bffServiceFees.hashCode())) * 31;
        List<BffDeliveryFee> list3 = this.deliveryFees;
        int hashCode27 = (hashCode26 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str19 = this.storeLoyaltyPreparator;
        int hashCode28 = (hashCode27 + (str19 == null ? 0 : str19.hashCode())) * 31;
        BigDecimal bigDecimal = this.productMaxQuantity;
        int hashCode29 = (hashCode28 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str20 = this.bcpBannerDesc;
        int hashCode30 = (hashCode29 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.bcpBanner;
        int hashCode31 = (hashCode30 + (str21 == null ? 0 : str21.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.minOrderAmount;
        int hashCode32 = (hashCode31 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.preparationPrice;
        int hashCode33 = (hashCode32 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.preparatorMinimumAmount;
        int hashCode34 = (hashCode33 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str22 = this.preparatorCnuf;
        int hashCode35 = (hashCode34 + (str22 == null ? 0 : str22.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.freePreparationThreshold;
        int hashCode36 = (hashCode35 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str23 = this.googleMapStoreURL;
        int hashCode37 = (hashCode36 + (str23 == null ? 0 : str23.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.maxOrderWeighting;
        int hashCode38 = (hashCode37 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        Boolean bool5 = this.paymentOnSiteActivated;
        int hashCode39 = (hashCode38 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List<String> list4 = this.paymentChoice;
        int hashCode40 = (hashCode39 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool6 = this.isEWalletLoyaltyActivated;
        int hashCode41 = (hashCode40 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.freeDeliveryThreshold;
        int hashCode42 = (hashCode41 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        List<Boolean> list5 = this.passDays;
        int hashCode43 = (hashCode42 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<BffLimit1> list6 = this.limits;
        int hashCode44 = (hashCode43 + (list6 == null ? 0 : list6.hashCode())) * 31;
        boolean z = this.returnableShoppingBag;
        if (z) {
            z = true;
        }
        int i2 = (hashCode44 + (z ? 1 : 0)) * 31;
        Boolean bool7 = this.yieldEligible;
        int hashCode45 = (i2 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.facilityHasInStoreService;
        if (bool8 != null) {
            i = bool8.hashCode();
        }
        return hashCode45 + i;
    }

    @C12580l
    public final Boolean isEWalletLoyaltyActivated() {
        return this.isEWalletLoyaltyActivated;
    }

    @C12580l
    public final Boolean isFranchised() {
        return this.isFranchised;
    }

    @C12580l
    public final Boolean isPVFR() {
        return this.isPVFR;
    }

    @C12579k
    public String toString() {
        String str = this.f100675id;
        String str2 = this.facilityServiceId;
        String str3 = this.name;
        String str4 = this.label;
        String str5 = this.status;
        String str6 = this.storeFormat;
        String str7 = this.storeService;
        String str8 = this.openingDate;
        String str9 = this.description;
        String str10 = this.type;
        String str11 = this.weight;
        String str12 = this.category;
        BffAdditionalServiceInformation bffAdditionalServiceInformation = this.additionalServiceInformation;
        String str13 = this.promise;
        Boolean bool = this.bffIsExpress;
        String str14 = this.minefiCode;
        String str15 = this.metiReference;
        String str16 = this.wlecFormat;
        String str17 = this.wlecService;
        String str18 = this.wording;
        Boolean bool2 = this.isPVFR;
        Boolean bool3 = this.hasVariableWeight;
        Boolean bool4 = this.isFranchised;
        List<String> list = this.deliveryZones;
        List<BffDeliveryCityZone> list2 = this.deliveryCityZones;
        BffServiceFees bffServiceFees = this.fees;
        List<BffDeliveryFee> list3 = this.deliveryFees;
        String str19 = this.storeLoyaltyPreparator;
        BigDecimal bigDecimal = this.productMaxQuantity;
        String str20 = this.bcpBannerDesc;
        String str21 = this.bcpBanner;
        BigDecimal bigDecimal2 = this.minOrderAmount;
        BigDecimal bigDecimal3 = this.preparationPrice;
        BigDecimal bigDecimal4 = this.preparatorMinimumAmount;
        String str22 = this.preparatorCnuf;
        BigDecimal bigDecimal5 = this.freePreparationThreshold;
        String str23 = this.googleMapStoreURL;
        BigDecimal bigDecimal6 = this.maxOrderWeighting;
        Boolean bool5 = this.paymentOnSiteActivated;
        List<String> list4 = this.paymentChoice;
        Boolean bool6 = this.isEWalletLoyaltyActivated;
        BigDecimal bigDecimal7 = this.freeDeliveryThreshold;
        List<Boolean> list5 = this.passDays;
        List<BffLimit1> list6 = this.limits;
        boolean z = this.returnableShoppingBag;
        Boolean bool7 = this.yieldEligible;
        Boolean bool8 = this.facilityHasInStoreService;
        return "BffCommonDetailedFacility(id=" + str + ", facilityServiceId=" + str2 + ", name=" + str3 + ", label=" + str4 + ", status=" + str5 + ", storeFormat=" + str6 + ", storeService=" + str7 + ", openingDate=" + str8 + ", description=" + str9 + ", type=" + str10 + ", weight=" + str11 + ", category=" + str12 + ", additionalServiceInformation=" + bffAdditionalServiceInformation + ", promise=" + str13 + ", bffIsExpress=" + bool + ", minefiCode=" + str14 + ", metiReference=" + str15 + ", wlecFormat=" + str16 + ", wlecService=" + str17 + ", wording=" + str18 + ", isPVFR=" + bool2 + ", hasVariableWeight=" + bool3 + ", isFranchised=" + bool4 + ", deliveryZones=" + list + ", deliveryCityZones=" + list2 + ", fees=" + bffServiceFees + ", deliveryFees=" + list3 + ", storeLoyaltyPreparator=" + str19 + ", productMaxQuantity=" + bigDecimal + ", bcpBannerDesc=" + str20 + ", bcpBanner=" + str21 + ", minOrderAmount=" + bigDecimal2 + ", preparationPrice=" + bigDecimal3 + ", preparatorMinimumAmount=" + bigDecimal4 + ", preparatorCnuf=" + str22 + ", freePreparationThreshold=" + bigDecimal5 + ", googleMapStoreURL=" + str23 + ", maxOrderWeighting=" + bigDecimal6 + ", paymentOnSiteActivated=" + bool5 + ", paymentChoice=" + list4 + ", isEWalletLoyaltyActivated=" + bool6 + ", freeDeliveryThreshold=" + bigDecimal7 + ", passDays=" + list5 + ", limits=" + list6 + ", returnableShoppingBag=" + z + ", yieldEligible=" + bool7 + ", facilityHasInStoreService=" + bool8 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCommonDetailedFacility(int i, int i2, @C12438n("id") String str, @C12438n("facility_service_id") String str2, @C12438n("name") String str3, @C12438n("label") String str4, @C12438n("status") String str5, @C12438n("store_format") String str6, @C12438n("store_service") String str7, @C12438n("opening_date") String str8, @C12438n("description") String str9, @C12438n("type") String str10, @C12438n("weight") String str11, @C12438n("category") String str12, @C12438n("additional_service_information") BffAdditionalServiceInformation bffAdditionalServiceInformation, @C12438n("promise") String str13, @C12438n("bff_is_express") Boolean bool, @C12438n("minefi_code") String str14, @C12438n("meti_reference") String str15, @C12438n("wlec_format") String str16, @C12438n("wlec_service") String str17, @C12438n("wording") String str18, @C12438n("is_PVFR") Boolean bool2, @C12438n("has_variable_weight") Boolean bool3, @C12438n("is_franchised") Boolean bool4, @C12438n("delivery_zones") List list, @C12438n("delivery_city_zones") List list2, @C12438n("fees") BffServiceFees bffServiceFees, @C12438n("delivery_fees") List list3, @C12438n("store_loyalty_preparator") String str19, @C12196b @C12438n("product_max_quantity") BigDecimal bigDecimal, @C12438n("bcp_banner_desc") String str20, @C12438n("bcp_banner") String str21, @C12196b @C12438n("min_order_amount") BigDecimal bigDecimal2, @C12196b @C12438n("preparation_price") BigDecimal bigDecimal3, @C12196b @C12438n("preparator_minimum_amount") BigDecimal bigDecimal4, @C12438n("preparator_cnuf") String str22, @C12196b @C12438n("free_preparation_threshold") BigDecimal bigDecimal5, @C12438n("google_map_store_URL") String str23, @C12196b @C12438n("max_order_weighting") BigDecimal bigDecimal6, @C12438n("payment_on_site_activated") Boolean bool5, @C12438n("payment_choice") List list4, @C12438n("is_e_wallet_loyalty_activated") Boolean bool6, @C12196b @C12438n("free_delivery_threshold") BigDecimal bigDecimal7, @C12438n("pass_days") List list5, @C12438n("limits") List list6, @C12438n("returnable_shopping_bag") boolean z, @C12438n("yield_eligible") Boolean bool7, @C12438n("facility_has_in_store_service") Boolean bool8, C12295n1 n1Var) {
        int i3 = i;
        int i4 = i2;
        if (((i3 & 0) != 0) || ((i4 & 0) != 0)) {
            C12261c1.m49255a(new int[]{i3, i4}, new int[]{0, 0}, BffCommonDetailedFacility$$serializer.INSTANCE.getDescriptor());
        }
        if ((i3 & 1) == 0) {
            this.f100675id = null;
        } else {
            this.f100675id = str;
        }
        if ((i3 & 2) == 0) {
            this.facilityServiceId = null;
        } else {
            this.facilityServiceId = str2;
        }
        if ((i3 & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i3 & 8) == 0) {
            this.label = null;
        } else {
            this.label = str4;
        }
        if ((i3 & 16) == 0) {
            this.status = null;
        } else {
            this.status = str5;
        }
        if ((i3 & 32) == 0) {
            this.storeFormat = null;
        } else {
            this.storeFormat = str6;
        }
        if ((i3 & 64) == 0) {
            this.storeService = null;
        } else {
            this.storeService = str7;
        }
        if ((i3 & 128) == 0) {
            this.openingDate = null;
        } else {
            this.openingDate = str8;
        }
        if ((i3 & 256) == 0) {
            this.description = null;
        } else {
            this.description = str9;
        }
        if ((i3 & 512) == 0) {
            this.type = null;
        } else {
            this.type = str10;
        }
        if ((i3 & 1024) == 0) {
            this.weight = null;
        } else {
            this.weight = str11;
        }
        if ((i3 & 2048) == 0) {
            this.category = null;
        } else {
            this.category = str12;
        }
        if ((i3 & 4096) == 0) {
            this.additionalServiceInformation = null;
        } else {
            this.additionalServiceInformation = bffAdditionalServiceInformation;
        }
        if ((i3 & 8192) == 0) {
            this.promise = null;
        } else {
            this.promise = str13;
        }
        if ((i3 & 16384) == 0) {
            this.bffIsExpress = null;
        } else {
            this.bffIsExpress = bool;
        }
        if ((32768 & i3) == 0) {
            this.minefiCode = null;
        } else {
            this.minefiCode = str14;
        }
        if ((65536 & i3) == 0) {
            this.metiReference = null;
        } else {
            this.metiReference = str15;
        }
        if ((131072 & i3) == 0) {
            this.wlecFormat = null;
        } else {
            this.wlecFormat = str16;
        }
        if ((262144 & i3) == 0) {
            this.wlecService = null;
        } else {
            this.wlecService = str17;
        }
        if ((524288 & i3) == 0) {
            this.wording = null;
        } else {
            this.wording = str18;
        }
        if ((1048576 & i3) == 0) {
            this.isPVFR = null;
        } else {
            this.isPVFR = bool2;
        }
        if ((2097152 & i3) == 0) {
            this.hasVariableWeight = null;
        } else {
            this.hasVariableWeight = bool3;
        }
        if ((4194304 & i3) == 0) {
            this.isFranchised = null;
        } else {
            this.isFranchised = bool4;
        }
        if ((8388608 & i3) == 0) {
            this.deliveryZones = null;
        } else {
            this.deliveryZones = list;
        }
        if ((16777216 & i3) == 0) {
            this.deliveryCityZones = null;
        } else {
            this.deliveryCityZones = list2;
        }
        if ((33554432 & i3) == 0) {
            this.fees = null;
        } else {
            this.fees = bffServiceFees;
        }
        if ((67108864 & i3) == 0) {
            this.deliveryFees = null;
        } else {
            this.deliveryFees = list3;
        }
        if ((134217728 & i3) == 0) {
            this.storeLoyaltyPreparator = null;
        } else {
            this.storeLoyaltyPreparator = str19;
        }
        if ((268435456 & i3) == 0) {
            this.productMaxQuantity = null;
        } else {
            this.productMaxQuantity = bigDecimal;
        }
        if ((536870912 & i3) == 0) {
            this.bcpBannerDesc = null;
        } else {
            this.bcpBannerDesc = str20;
        }
        if ((1073741824 & i3) == 0) {
            this.bcpBanner = null;
        } else {
            this.bcpBanner = str21;
        }
        if ((i3 & Integer.MIN_VALUE) == 0) {
            this.minOrderAmount = null;
        } else {
            this.minOrderAmount = bigDecimal2;
        }
        if ((i4 & 1) == 0) {
            this.preparationPrice = null;
        } else {
            this.preparationPrice = bigDecimal3;
        }
        if ((i4 & 2) == 0) {
            this.preparatorMinimumAmount = null;
        } else {
            this.preparatorMinimumAmount = bigDecimal4;
        }
        if ((i4 & 4) == 0) {
            this.preparatorCnuf = null;
        } else {
            this.preparatorCnuf = str22;
        }
        if ((i4 & 8) == 0) {
            this.freePreparationThreshold = null;
        } else {
            this.freePreparationThreshold = bigDecimal5;
        }
        if ((i4 & 16) == 0) {
            this.googleMapStoreURL = null;
        } else {
            this.googleMapStoreURL = str23;
        }
        if ((i4 & 32) == 0) {
            this.maxOrderWeighting = null;
        } else {
            this.maxOrderWeighting = bigDecimal6;
        }
        if ((i4 & 64) == 0) {
            this.paymentOnSiteActivated = null;
        } else {
            this.paymentOnSiteActivated = bool5;
        }
        if ((i4 & 128) == 0) {
            this.paymentChoice = null;
        } else {
            this.paymentChoice = list4;
        }
        if ((i4 & 256) == 0) {
            this.isEWalletLoyaltyActivated = null;
        } else {
            this.isEWalletLoyaltyActivated = bool6;
        }
        if ((i4 & 512) == 0) {
            this.freeDeliveryThreshold = null;
        } else {
            this.freeDeliveryThreshold = bigDecimal7;
        }
        if ((i4 & 1024) == 0) {
            this.passDays = null;
        } else {
            this.passDays = list5;
        }
        if ((i4 & 2048) == 0) {
            this.limits = null;
        } else {
            this.limits = list6;
        }
        if ((i4 & 4096) == 0) {
            this.returnableShoppingBag = false;
        } else {
            this.returnableShoppingBag = z;
        }
        if ((i4 & 8192) == 0) {
            this.yieldEligible = null;
        } else {
            this.yieldEligible = bool7;
        }
        if ((i4 & 16384) == 0) {
            this.facilityHasInStoreService = null;
        } else {
            this.facilityHasInStoreService = bool8;
        }
    }

    public BffCommonDetailedFacility(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l BffAdditionalServiceInformation bffAdditionalServiceInformation, @C12580l String str13, @C12580l Boolean bool, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l Boolean bool2, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12580l List<String> list, @C12580l List<BffDeliveryCityZone> list2, @C12580l BffServiceFees bffServiceFees, @C12580l List<BffDeliveryFee> list3, @C12580l String str19, @C12580l BigDecimal bigDecimal, @C12580l String str20, @C12580l String str21, @C12580l BigDecimal bigDecimal2, @C12580l BigDecimal bigDecimal3, @C12580l BigDecimal bigDecimal4, @C12580l String str22, @C12580l BigDecimal bigDecimal5, @C12580l String str23, @C12580l BigDecimal bigDecimal6, @C12580l Boolean bool5, @C12580l List<String> list4, @C12580l Boolean bool6, @C12580l BigDecimal bigDecimal7, @C12580l List<Boolean> list5, @C12580l List<BffLimit1> list6, boolean z, @C12580l Boolean bool7, @C12580l Boolean bool8) {
        this.f100675id = str;
        this.facilityServiceId = str2;
        this.name = str3;
        this.label = str4;
        this.status = str5;
        this.storeFormat = str6;
        this.storeService = str7;
        this.openingDate = str8;
        this.description = str9;
        this.type = str10;
        this.weight = str11;
        this.category = str12;
        this.additionalServiceInformation = bffAdditionalServiceInformation;
        this.promise = str13;
        this.bffIsExpress = bool;
        this.minefiCode = str14;
        this.metiReference = str15;
        this.wlecFormat = str16;
        this.wlecService = str17;
        this.wording = str18;
        this.isPVFR = bool2;
        this.hasVariableWeight = bool3;
        this.isFranchised = bool4;
        this.deliveryZones = list;
        this.deliveryCityZones = list2;
        this.fees = bffServiceFees;
        this.deliveryFees = list3;
        this.storeLoyaltyPreparator = str19;
        this.productMaxQuantity = bigDecimal;
        this.bcpBannerDesc = str20;
        this.bcpBanner = str21;
        this.minOrderAmount = bigDecimal2;
        this.preparationPrice = bigDecimal3;
        this.preparatorMinimumAmount = bigDecimal4;
        this.preparatorCnuf = str22;
        this.freePreparationThreshold = bigDecimal5;
        this.googleMapStoreURL = str23;
        this.maxOrderWeighting = bigDecimal6;
        this.paymentOnSiteActivated = bool5;
        this.paymentChoice = list4;
        this.isEWalletLoyaltyActivated = bool6;
        this.freeDeliveryThreshold = bigDecimal7;
        this.passDays = list5;
        this.limits = list6;
        this.returnableShoppingBag = z;
        this.yieldEligible = bool7;
        this.facilityHasInStoreService = bool8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCommonDetailedFacility(java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation r59, java.lang.String r60, java.lang.Boolean r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.Boolean r67, java.lang.Boolean r68, java.lang.Boolean r69, java.util.List r70, java.util.List r71, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees r72, java.util.List r73, java.lang.String r74, java.math.BigDecimal r75, java.lang.String r76, java.lang.String r77, java.math.BigDecimal r78, java.math.BigDecimal r79, java.math.BigDecimal r80, java.lang.String r81, java.math.BigDecimal r82, java.lang.String r83, java.math.BigDecimal r84, java.lang.Boolean r85, java.util.List r86, java.lang.Boolean r87, java.math.BigDecimal r88, java.util.List r89, java.util.List r90, boolean r91, java.lang.Boolean r92, java.lang.Boolean r93, int r94, int r95, kotlin.jvm.internal.DefaultConstructorMarker r96) {
        /*
            r46 = this;
            r0 = r94
            r1 = r95
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = r47
        L_0x000c:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r48
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 0
            goto L_0x001c
        L_0x001a:
            r5 = r49
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = 0
            goto L_0x0024
        L_0x0022:
            r6 = r50
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r51
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r52
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r53
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r54
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r55
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = 0
            goto L_0x0054
        L_0x0052:
            r12 = r56
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = 0
            goto L_0x005c
        L_0x005a:
            r13 = r57
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = 0
            goto L_0x0064
        L_0x0062:
            r14 = r58
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = 0
            goto L_0x006c
        L_0x006a:
            r15 = r59
        L_0x006c:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0072
            r3 = 0
            goto L_0x0074
        L_0x0072:
            r3 = r60
        L_0x0074:
            r16 = r3
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x007c
            r3 = 0
            goto L_0x007e
        L_0x007c:
            r3 = r61
        L_0x007e:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0088
            r17 = 0
            goto L_0x008a
        L_0x0088:
            r17 = r62
        L_0x008a:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x0093
            r18 = 0
            goto L_0x0095
        L_0x0093:
            r18 = r63
        L_0x0095:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x009e
            r19 = 0
            goto L_0x00a0
        L_0x009e:
            r19 = r64
        L_0x00a0:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00a9
            r20 = 0
            goto L_0x00ab
        L_0x00a9:
            r20 = r65
        L_0x00ab:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00b4
            r21 = 0
            goto L_0x00b6
        L_0x00b4:
            r21 = r66
        L_0x00b6:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00bf
            r22 = 0
            goto L_0x00c1
        L_0x00bf:
            r22 = r67
        L_0x00c1:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00ca
            r23 = 0
            goto L_0x00cc
        L_0x00ca:
            r23 = r68
        L_0x00cc:
            r24 = 4194304(0x400000, float:5.877472E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00d5
            r24 = 0
            goto L_0x00d7
        L_0x00d5:
            r24 = r69
        L_0x00d7:
            r25 = 8388608(0x800000, float:1.17549435E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e0
            r25 = 0
            goto L_0x00e2
        L_0x00e0:
            r25 = r70
        L_0x00e2:
            r26 = 16777216(0x1000000, float:2.3509887E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00eb
            r26 = 0
            goto L_0x00ed
        L_0x00eb:
            r26 = r71
        L_0x00ed:
            r27 = 33554432(0x2000000, float:9.403955E-38)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00f6
            r27 = 0
            goto L_0x00f8
        L_0x00f6:
            r27 = r72
        L_0x00f8:
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0101
            r28 = 0
            goto L_0x0103
        L_0x0101:
            r28 = r73
        L_0x0103:
            r29 = 134217728(0x8000000, float:3.85186E-34)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x010c
            r29 = 0
            goto L_0x010e
        L_0x010c:
            r29 = r74
        L_0x010e:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x0117
            r30 = 0
            goto L_0x0119
        L_0x0117:
            r30 = r75
        L_0x0119:
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0122
            r31 = 0
            goto L_0x0124
        L_0x0122:
            r31 = r76
        L_0x0124:
            r32 = 1073741824(0x40000000, float:2.0)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x012d
            r32 = 0
            goto L_0x012f
        L_0x012d:
            r32 = r77
        L_0x012f:
            r33 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r33
            if (r0 == 0) goto L_0x0137
            r0 = 0
            goto L_0x0139
        L_0x0137:
            r0 = r78
        L_0x0139:
            r33 = r1 & 1
            if (r33 == 0) goto L_0x0140
            r33 = 0
            goto L_0x0142
        L_0x0140:
            r33 = r79
        L_0x0142:
            r34 = r1 & 2
            if (r34 == 0) goto L_0x0149
            r34 = 0
            goto L_0x014b
        L_0x0149:
            r34 = r80
        L_0x014b:
            r35 = r1 & 4
            if (r35 == 0) goto L_0x0152
            r35 = 0
            goto L_0x0154
        L_0x0152:
            r35 = r81
        L_0x0154:
            r36 = r1 & 8
            if (r36 == 0) goto L_0x015b
            r36 = 0
            goto L_0x015d
        L_0x015b:
            r36 = r82
        L_0x015d:
            r37 = r1 & 16
            if (r37 == 0) goto L_0x0164
            r37 = 0
            goto L_0x0166
        L_0x0164:
            r37 = r83
        L_0x0166:
            r38 = r1 & 32
            if (r38 == 0) goto L_0x016d
            r38 = 0
            goto L_0x016f
        L_0x016d:
            r38 = r84
        L_0x016f:
            r39 = r1 & 64
            if (r39 == 0) goto L_0x0176
            r39 = 0
            goto L_0x0178
        L_0x0176:
            r39 = r85
        L_0x0178:
            r94 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0180
            r0 = 0
            goto L_0x0182
        L_0x0180:
            r0 = r86
        L_0x0182:
            r40 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x018a
            r0 = 0
            goto L_0x018c
        L_0x018a:
            r0 = r87
        L_0x018c:
            r41 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0194
            r0 = 0
            goto L_0x0196
        L_0x0194:
            r0 = r88
        L_0x0196:
            r42 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x019e
            r0 = 0
            goto L_0x01a0
        L_0x019e:
            r0 = r89
        L_0x01a0:
            r43 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01a8
            r0 = 0
            goto L_0x01aa
        L_0x01a8:
            r0 = r90
        L_0x01aa:
            r44 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01b2
            r0 = 0
            goto L_0x01b4
        L_0x01b2:
            r0 = r91
        L_0x01b4:
            r45 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01bc
            r0 = 0
            goto L_0x01be
        L_0x01bc:
            r0 = r92
        L_0x01be:
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x01c4
            r1 = 0
            goto L_0x01c6
        L_0x01c4:
            r1 = r93
        L_0x01c6:
            r47 = r46
            r48 = r2
            r49 = r4
            r50 = r5
            r51 = r6
            r52 = r7
            r53 = r8
            r54 = r9
            r55 = r10
            r56 = r11
            r57 = r12
            r58 = r13
            r59 = r14
            r60 = r15
            r61 = r16
            r62 = r3
            r63 = r17
            r64 = r18
            r65 = r19
            r66 = r20
            r67 = r21
            r68 = r22
            r69 = r23
            r70 = r24
            r71 = r25
            r72 = r26
            r73 = r27
            r74 = r28
            r75 = r29
            r76 = r30
            r77 = r31
            r78 = r32
            r79 = r94
            r80 = r33
            r81 = r34
            r82 = r35
            r83 = r36
            r84 = r37
            r85 = r38
            r86 = r39
            r87 = r40
            r88 = r41
            r89 = r42
            r90 = r43
            r91 = r44
            r92 = r45
            r93 = r0
            r94 = r1
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAdditionalServiceInformation, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffServiceFees, java.util.List, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.lang.Boolean, java.util.List, java.lang.Boolean, java.math.BigDecimal, java.util.List, java.util.List, boolean, java.lang.Boolean, java.lang.Boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
