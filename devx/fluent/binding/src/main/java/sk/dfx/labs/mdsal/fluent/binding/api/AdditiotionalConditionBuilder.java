package sk.dfx.labs.mdsal.fluent.binding.api;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public interface AdditiotionalConditionBuilder<S> {

    AdditiotionalConditionBuilder<S> or(Predicate<S> predicate);

    <V> void orValueOf(Function<S, V> object, V string);

    AdditiotionalConditionBuilder<S> orIs(Predicate<S> predicate);
}
