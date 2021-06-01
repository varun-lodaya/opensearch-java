/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.TypeQuery
public final class TypeQuery extends QueryBase {
	private final String value;

	// ---------------------------------------------------------------------------------------------

	protected TypeQuery(Builder builder) {
		super(builder);
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code value}
	 */
	public String value() {
		return this.value;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("value");
		generator.write(this.value);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TypeQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<TypeQuery> {
		private String value;

		/**
		 * API name: {@code value}
		 */
		public Builder value(String value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TypeQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TypeQuery build() {

			return new TypeQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for TypeQuery
	 */
	public static final JsonpValueParser<TypeQuery> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, TypeQuery::setupTypeQueryParser);

	protected static void setupTypeQueryParser(DelegatingJsonpValueParser<TypeQuery.Builder> op) {
		QueryBase.setupQueryBaseParser(op);
		op.add(Builder::value, JsonpValueParser.stringParser(), "value");

	}

}