/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

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

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.cluster;

import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.ElasticsearchException;
import org.opensearch.client.opensearch._types.ErrorResponse;
import org.opensearch.client.transport.ElasticsearchTransport;
import org.opensearch.client.transport.JsonEndpoint;
import org.opensearch.client.transport.TransportOptions;
import org.opensearch.client.transport.endpoints.BooleanResponse;
import org.opensearch.client.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the cluster namespace.
 */
public class ElasticsearchClusterAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchClusterAsyncClient> {

	public ElasticsearchClusterAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchClusterAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchClusterAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchClusterAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: cluster.allocation_explain

	/**
	 * Provides explanations for shard allocations in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationExplainResponse> allocationExplain(AllocationExplainRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AllocationExplainRequest, AllocationExplainResponse, ErrorResponse> endpoint =
				(JsonEndpoint<AllocationExplainRequest, AllocationExplainResponse, ErrorResponse>)
						AllocationExplainRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides explanations for shard allocations in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AllocationExplainRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AllocationExplainResponse> allocationExplain(
			Function<AllocationExplainRequest.Builder, ObjectBuilder<AllocationExplainRequest>> fn)
			throws IOException, ElasticsearchException {
		return allocationExplain(fn.apply(new AllocationExplainRequest.Builder()).build());
	}

	/**
	 * Provides explanations for shard allocations in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-allocation-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationExplainResponse> allocationExplain() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new AllocationExplainRequest.Builder().build(),
				AllocationExplainRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.delete_component_template

	/**
	 * Deletes a component template
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteComponentTemplateResponse> deleteComponentTemplate(
			DeleteComponentTemplateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse, ErrorResponse> endpoint =
				(JsonEndpoint<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse, ErrorResponse>)
						DeleteComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a component template
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteComponentTemplateResponse> deleteComponentTemplate(
			Function<DeleteComponentTemplateRequest.Builder, ObjectBuilder<DeleteComponentTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteComponentTemplate(fn.apply(new DeleteComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.delete_voting_config_exclusions

	/**
	 * Clears cluster voting config exclusions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> deleteVotingConfigExclusions(DeleteVotingConfigExclusionsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse> endpoint =
				(JsonEndpoint<DeleteVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse>)
						DeleteVotingConfigExclusionsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clears cluster voting config exclusions.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteVotingConfigExclusionsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> deleteVotingConfigExclusions(
			Function<DeleteVotingConfigExclusionsRequest.Builder, ObjectBuilder<DeleteVotingConfigExclusionsRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteVotingConfigExclusions(fn.apply(new DeleteVotingConfigExclusionsRequest.Builder()).build());
	}

	/**
	 * Clears cluster voting config exclusions.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> deleteVotingConfigExclusions()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new DeleteVotingConfigExclusionsRequest.Builder().build(),
				DeleteVotingConfigExclusionsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.exists_component_template

	/**
	 * Returns information about whether a particular component template exist
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsComponentTemplate(ExistsComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ExistsComponentTemplateRequest, BooleanResponse, ErrorResponse> endpoint =
				(JsonEndpoint<ExistsComponentTemplateRequest, BooleanResponse, ErrorResponse>)
						ExistsComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about whether a particular component template exist
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsComponentTemplate(
			Function<ExistsComponentTemplateRequest.Builder, ObjectBuilder<ExistsComponentTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return existsComponentTemplate(fn.apply(new ExistsComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.get_component_template

	/**
	 * Returns one or more component templates
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetComponentTemplateResponse> getComponentTemplate(GetComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse> endpoint =
				(JsonEndpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse>)
						GetComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns one or more component templates
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetComponentTemplateResponse> getComponentTemplate(
			Function<GetComponentTemplateRequest.Builder, ObjectBuilder<GetComponentTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return getComponentTemplate(fn.apply(new GetComponentTemplateRequest.Builder()).build());
	}

	/**
	 * Returns one or more component templates
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetComponentTemplateResponse> getComponentTemplate()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetComponentTemplateRequest.Builder().build(),
				GetComponentTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.get_settings

	/**
	 * Returns cluster settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetClusterSettingsResponse> getSettings(GetClusterSettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetClusterSettingsRequest, GetClusterSettingsResponse, ErrorResponse> endpoint =
				(JsonEndpoint<GetClusterSettingsRequest, GetClusterSettingsResponse, ErrorResponse>)
						GetClusterSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns cluster settings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetClusterSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetClusterSettingsResponse> getSettings(
			Function<GetClusterSettingsRequest.Builder, ObjectBuilder<GetClusterSettingsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getSettings(fn.apply(new GetClusterSettingsRequest.Builder()).build());
	}

	/**
	 * Returns cluster settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-get-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetClusterSettingsResponse> getSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetClusterSettingsRequest.Builder().build(),
				GetClusterSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.health

	/**
	 * Returns basic information about the health of the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health(HealthRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HealthRequest, HealthResponse, ErrorResponse> endpoint =
				(JsonEndpoint<HealthRequest, HealthResponse, ErrorResponse>) HealthRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns basic information about the health of the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HealthRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HealthResponse> health(
			Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn)
			throws IOException, ElasticsearchException {
		return health(fn.apply(new HealthRequest.Builder()).build());
	}

	/**
	 * Returns basic information about the health of the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new HealthRequest.Builder().build(), HealthRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.pending_tasks

	/**
	 * Returns a list of any cluster-level changes (e.g. create index, update
	 * mapping, allocate or fail shard) which have not yet been executed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PendingTasksResponse> pendingTasks(PendingTasksRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PendingTasksRequest, PendingTasksResponse, ErrorResponse> endpoint =
				(JsonEndpoint<PendingTasksRequest, PendingTasksResponse, ErrorResponse>) PendingTasksRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a list of any cluster-level changes (e.g. create index, update
	 * mapping, allocate or fail shard) which have not yet been executed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PendingTasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PendingTasksResponse> pendingTasks(
			Function<PendingTasksRequest.Builder, ObjectBuilder<PendingTasksRequest>> fn)
			throws IOException, ElasticsearchException {
		return pendingTasks(fn.apply(new PendingTasksRequest.Builder()).build());
	}

	/**
	 * Returns a list of any cluster-level changes (e.g. create index, update
	 * mapping, allocate or fail shard) which have not yet been executed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-pending.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PendingTasksResponse> pendingTasks() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new PendingTasksRequest.Builder().build(),
				PendingTasksRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.post_voting_config_exclusions

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> postVotingConfigExclusions(PostVotingConfigExclusionsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse> endpoint =
				(JsonEndpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse>)
						PostVotingConfigExclusionsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PostVotingConfigExclusionsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> postVotingConfigExclusions(
			Function<PostVotingConfigExclusionsRequest.Builder, ObjectBuilder<PostVotingConfigExclusionsRequest>> fn)
			throws IOException, ElasticsearchException {
		return postVotingConfigExclusions(fn.apply(new PostVotingConfigExclusionsRequest.Builder()).build());
	}

	/**
	 * Updates the cluster voting config exclusions by node ids or node names.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/voting-config-exclusions.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> postVotingConfigExclusions() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new PostVotingConfigExclusionsRequest.Builder().build(),
				PostVotingConfigExclusionsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.put_component_template

	/**
	 * Creates or updates a component template
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutComponentTemplateResponse> putComponentTemplate(PutComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse> endpoint =
				(JsonEndpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse>)
						PutComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a component template
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutComponentTemplateResponse> putComponentTemplate(
			Function<PutComponentTemplateRequest.Builder, ObjectBuilder<PutComponentTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return putComponentTemplate(fn.apply(new PutComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.put_settings

	/**
	 * Updates the cluster settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutClusterSettingsResponse> putSettings(PutClusterSettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutClusterSettingsRequest, PutClusterSettingsResponse, ErrorResponse> endpoint =
				(JsonEndpoint<PutClusterSettingsRequest, PutClusterSettingsResponse, ErrorResponse>)
						PutClusterSettingsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates the cluster settings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutClusterSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutClusterSettingsResponse> putSettings(
			Function<PutClusterSettingsRequest.Builder, ObjectBuilder<PutClusterSettingsRequest>> fn)
			throws IOException, ElasticsearchException {
		return putSettings(fn.apply(new PutClusterSettingsRequest.Builder()).build());
	}

	/**
	 * Updates the cluster settings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-update-settings.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutClusterSettingsResponse> putSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new PutClusterSettingsRequest.Builder().build(),
				PutClusterSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.remote_info

	/**
	 * Returns the information about configured remote clusters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-remote-info.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<RemoteInfoResponse> remoteInfo() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(RemoteInfoRequest._INSTANCE, RemoteInfoRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.reroute

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RerouteResponse> reroute(RerouteRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RerouteRequest, RerouteResponse, ErrorResponse> endpoint =
				(JsonEndpoint<RerouteRequest, RerouteResponse, ErrorResponse>) RerouteRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RerouteRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RerouteResponse> reroute(
			Function<RerouteRequest.Builder, ObjectBuilder<RerouteRequest>> fn)
			throws IOException, ElasticsearchException {
		return reroute(fn.apply(new RerouteRequest.Builder()).build());
	}

	/**
	 * Allows to manually change the allocation of individual shards in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-reroute.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RerouteResponse> reroute() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new RerouteRequest.Builder().build(), RerouteRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.state

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StateResponse> state(StateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StateRequest, StateResponse, ErrorResponse> endpoint =
				(JsonEndpoint<StateRequest, StateResponse, ErrorResponse>) StateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StateResponse> state(Function<StateRequest.Builder, ObjectBuilder<StateRequest>> fn)
			throws IOException, ElasticsearchException {
		return state(fn.apply(new StateRequest.Builder()).build());
	}

	/**
	 * Returns a comprehensive information about the state of the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-state.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StateResponse> state() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new StateRequest.Builder().build(), StateRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cluster.stats

	/**
	 * Returns high-level overview of cluster statistics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClusterStatsResponse> stats(ClusterStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClusterStatsRequest, ClusterStatsResponse, ErrorResponse> endpoint =
				(JsonEndpoint<ClusterStatsRequest, ClusterStatsResponse, ErrorResponse>) ClusterStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns high-level overview of cluster statistics.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClusterStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClusterStatsResponse> stats(
			Function<ClusterStatsRequest.Builder, ObjectBuilder<ClusterStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return stats(fn.apply(new ClusterStatsRequest.Builder()).build());
	}

	/**
	 * Returns high-level overview of cluster statistics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClusterStatsResponse> stats() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ClusterStatsRequest.Builder().build(),
				ClusterStatsRequest._ENDPOINT, this.transportOptions);
	}

}