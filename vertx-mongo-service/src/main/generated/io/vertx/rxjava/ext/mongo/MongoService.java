/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.mongo;

import java.util.Map;
import rx.Observable;
import io.vertx.ext.mongo.MongoClientDeleteResult;
import io.vertx.ext.mongo.WriteOption;
import io.vertx.rxjava.core.Vertx;
import io.vertx.core.json.JsonArray;
import java.util.List;
import io.vertx.ext.mongo.IndexOptions;
import io.vertx.ext.mongo.FindOptions;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ext.mongo.MongoClientUpdateResult;
import io.vertx.ext.mongo.UpdateOptions;

/**
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.mongo.MongoService original} non RX-ified interface using Vert.x codegen.
 */

public class MongoService extends MongoClient {

  final io.vertx.ext.mongo.MongoService delegate;

  public MongoService(io.vertx.ext.mongo.MongoService delegate) {
    super(delegate);
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * Create a proxy to a service that is deployed somewhere on the event bus
   * @param vertx the Vert.x instance
   * @param address the address the service is listening on on the event bus
   * @return the service
   */
  public static MongoService createEventBusProxy(Vertx vertx, String address) { 
    MongoService ret = MongoService.newInstance(io.vertx.ext.mongo.MongoService.createEventBusProxy((io.vertx.core.Vertx)vertx.getDelegate(), address));
    return ret;
  }

  public MongoService save(String collection, JsonObject document, Handler<AsyncResult<String>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).save(collection, document, resultHandler);
    return this;
  }

  public Observable<String> saveObservable(String collection, JsonObject document) { 
    io.vertx.rx.java.ObservableFuture<String> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    save(collection, document, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService saveWithOptions(String collection, JsonObject document, WriteOption writeOption, Handler<AsyncResult<String>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).saveWithOptions(collection, document, writeOption, resultHandler);
    return this;
  }

  public Observable<String> saveWithOptionsObservable(String collection, JsonObject document, WriteOption writeOption) { 
    io.vertx.rx.java.ObservableFuture<String> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    saveWithOptions(collection, document, writeOption, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService insert(String collection, JsonObject document, Handler<AsyncResult<String>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).insert(collection, document, resultHandler);
    return this;
  }

  public Observable<String> insertObservable(String collection, JsonObject document) { 
    io.vertx.rx.java.ObservableFuture<String> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    insert(collection, document, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService insertWithOptions(String collection, JsonObject document, WriteOption writeOption, Handler<AsyncResult<String>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).insertWithOptions(collection, document, writeOption, resultHandler);
    return this;
  }

  public Observable<String> insertWithOptionsObservable(String collection, JsonObject document, WriteOption writeOption) { 
    io.vertx.rx.java.ObservableFuture<String> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    insertWithOptions(collection, document, writeOption, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService update(String collection, JsonObject query, JsonObject update, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).update(collection, query, update, resultHandler);
    return this;
  }

  public Observable<Void> updateObservable(String collection, JsonObject query, JsonObject update) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    update(collection, query, update, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService updateCollection(String collection, JsonObject query, JsonObject update, Handler<AsyncResult<MongoClientUpdateResult>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).updateCollection(collection, query, update, resultHandler);
    return this;
  }

  public Observable<MongoClientUpdateResult> updateCollectionObservable(String collection, JsonObject query, JsonObject update) { 
    io.vertx.rx.java.ObservableFuture<MongoClientUpdateResult> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    updateCollection(collection, query, update, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService updateWithOptions(String collection, JsonObject query, JsonObject update, UpdateOptions options, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).updateWithOptions(collection, query, update, options, resultHandler);
    return this;
  }

  public Observable<Void> updateWithOptionsObservable(String collection, JsonObject query, JsonObject update, UpdateOptions options) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    updateWithOptions(collection, query, update, options, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService updateCollectionWithOptions(String collection, JsonObject query, JsonObject update, UpdateOptions options, Handler<AsyncResult<MongoClientUpdateResult>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).updateCollectionWithOptions(collection, query, update, options, resultHandler);
    return this;
  }

  public Observable<MongoClientUpdateResult> updateCollectionWithOptionsObservable(String collection, JsonObject query, JsonObject update, UpdateOptions options) { 
    io.vertx.rx.java.ObservableFuture<MongoClientUpdateResult> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    updateCollectionWithOptions(collection, query, update, options, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService replace(String collection, JsonObject query, JsonObject replace, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).replace(collection, query, replace, resultHandler);
    return this;
  }

  public Observable<Void> replaceObservable(String collection, JsonObject query, JsonObject replace) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    replace(collection, query, replace, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService replaceDocuments(String collection, JsonObject query, JsonObject replace, Handler<AsyncResult<MongoClientUpdateResult>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).replaceDocuments(collection, query, replace, resultHandler);
    return this;
  }

  public Observable<MongoClientUpdateResult> replaceDocumentsObservable(String collection, JsonObject query, JsonObject replace) { 
    io.vertx.rx.java.ObservableFuture<MongoClientUpdateResult> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    replaceDocuments(collection, query, replace, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService replaceWithOptions(String collection, JsonObject query, JsonObject replace, UpdateOptions options, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).replaceWithOptions(collection, query, replace, options, resultHandler);
    return this;
  }

  public Observable<Void> replaceWithOptionsObservable(String collection, JsonObject query, JsonObject replace, UpdateOptions options) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    replaceWithOptions(collection, query, replace, options, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService replaceDocumentsWithOptions(String collection, JsonObject query, JsonObject replace, UpdateOptions options, Handler<AsyncResult<MongoClientUpdateResult>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).replaceDocumentsWithOptions(collection, query, replace, options, resultHandler);
    return this;
  }

  public Observable<MongoClientUpdateResult> replaceDocumentsWithOptionsObservable(String collection, JsonObject query, JsonObject replace, UpdateOptions options) { 
    io.vertx.rx.java.ObservableFuture<MongoClientUpdateResult> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    replaceDocumentsWithOptions(collection, query, replace, options, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService find(String collection, JsonObject query, Handler<AsyncResult<List<JsonObject>>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).find(collection, query, resultHandler);
    return this;
  }

  public Observable<List<JsonObject>> findObservable(String collection, JsonObject query) { 
    io.vertx.rx.java.ObservableFuture<List<JsonObject>> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    find(collection, query, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService findBatch(String collection, JsonObject query, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).findBatch(collection, query, resultHandler);
    return this;
  }

  public Observable<JsonObject> findBatchObservable(String collection, JsonObject query) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    findBatch(collection, query, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService findWithOptions(String collection, JsonObject query, FindOptions options, Handler<AsyncResult<List<JsonObject>>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).findWithOptions(collection, query, options, resultHandler);
    return this;
  }

  public Observable<List<JsonObject>> findWithOptionsObservable(String collection, JsonObject query, FindOptions options) { 
    io.vertx.rx.java.ObservableFuture<List<JsonObject>> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    findWithOptions(collection, query, options, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService findBatchWithOptions(String collection, JsonObject query, FindOptions options, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).findBatchWithOptions(collection, query, options, resultHandler);
    return this;
  }

  public Observable<JsonObject> findBatchWithOptionsObservable(String collection, JsonObject query, FindOptions options) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    findBatchWithOptions(collection, query, options, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService findOne(String collection, JsonObject query, JsonObject fields, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).findOne(collection, query, fields, resultHandler);
    return this;
  }

  public Observable<JsonObject> findOneObservable(String collection, JsonObject query, JsonObject fields) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    findOne(collection, query, fields, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService findOneAndUpdate(String collection, JsonObject query, JsonObject update, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).findOneAndUpdate(collection, query, update, resultHandler);
    return this;
  }

  public Observable<JsonObject> findOneAndUpdateObservable(String collection, JsonObject query, JsonObject update) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    findOneAndUpdate(collection, query, update, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService findOneAndUpdateWithOptions(String collection, JsonObject query, JsonObject update, FindOptions findOptions, UpdateOptions updateOptions, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, resultHandler);
    return this;
  }

  public Observable<JsonObject> findOneAndUpdateWithOptionsObservable(String collection, JsonObject query, JsonObject update, FindOptions findOptions, UpdateOptions updateOptions) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    findOneAndUpdateWithOptions(collection, query, update, findOptions, updateOptions, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService findOneAndReplace(String collection, JsonObject query, JsonObject replace, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).findOneAndReplace(collection, query, replace, resultHandler);
    return this;
  }

  public Observable<JsonObject> findOneAndReplaceObservable(String collection, JsonObject query, JsonObject replace) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    findOneAndReplace(collection, query, replace, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService findOneAndReplaceWithOptions(String collection, JsonObject query, JsonObject update, FindOptions findOptions, UpdateOptions updateOptions, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).findOneAndReplaceWithOptions(collection, query, update, findOptions, updateOptions, resultHandler);
    return this;
  }

  public Observable<JsonObject> findOneAndReplaceWithOptionsObservable(String collection, JsonObject query, JsonObject update, FindOptions findOptions, UpdateOptions updateOptions) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    findOneAndReplaceWithOptions(collection, query, update, findOptions, updateOptions, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService findOneAndDelete(String collection, JsonObject query, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).findOneAndDelete(collection, query, resultHandler);
    return this;
  }

  public Observable<JsonObject> findOneAndDeleteObservable(String collection, JsonObject query) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    findOneAndDelete(collection, query, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService findOneAndDeleteWithOptions(String collection, JsonObject query, FindOptions findOptions, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).findOneAndDeleteWithOptions(collection, query, findOptions, resultHandler);
    return this;
  }

  public Observable<JsonObject> findOneAndDeleteWithOptionsObservable(String collection, JsonObject query, FindOptions findOptions) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    findOneAndDeleteWithOptions(collection, query, findOptions, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService count(String collection, JsonObject query, Handler<AsyncResult<Long>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).count(collection, query, resultHandler);
    return this;
  }

  public Observable<Long> countObservable(String collection, JsonObject query) { 
    io.vertx.rx.java.ObservableFuture<Long> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    count(collection, query, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService remove(String collection, JsonObject query, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).remove(collection, query, resultHandler);
    return this;
  }

  public Observable<Void> removeObservable(String collection, JsonObject query) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    remove(collection, query, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService removeDocuments(String collection, JsonObject query, Handler<AsyncResult<MongoClientDeleteResult>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).removeDocuments(collection, query, resultHandler);
    return this;
  }

  public Observable<MongoClientDeleteResult> removeDocumentsObservable(String collection, JsonObject query) { 
    io.vertx.rx.java.ObservableFuture<MongoClientDeleteResult> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    removeDocuments(collection, query, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService removeWithOptions(String collection, JsonObject query, WriteOption writeOption, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).removeWithOptions(collection, query, writeOption, resultHandler);
    return this;
  }

  public Observable<Void> removeWithOptionsObservable(String collection, JsonObject query, WriteOption writeOption) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    removeWithOptions(collection, query, writeOption, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService removeDocumentsWithOptions(String collection, JsonObject query, WriteOption writeOption, Handler<AsyncResult<MongoClientDeleteResult>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).removeDocumentsWithOptions(collection, query, writeOption, resultHandler);
    return this;
  }

  public Observable<MongoClientDeleteResult> removeDocumentsWithOptionsObservable(String collection, JsonObject query, WriteOption writeOption) { 
    io.vertx.rx.java.ObservableFuture<MongoClientDeleteResult> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    removeDocumentsWithOptions(collection, query, writeOption, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService removeOne(String collection, JsonObject query, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).removeOne(collection, query, resultHandler);
    return this;
  }

  public Observable<Void> removeOneObservable(String collection, JsonObject query) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    removeOne(collection, query, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService removeDocument(String collection, JsonObject query, Handler<AsyncResult<MongoClientDeleteResult>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).removeDocument(collection, query, resultHandler);
    return this;
  }

  public Observable<MongoClientDeleteResult> removeDocumentObservable(String collection, JsonObject query) { 
    io.vertx.rx.java.ObservableFuture<MongoClientDeleteResult> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    removeDocument(collection, query, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService removeOneWithOptions(String collection, JsonObject query, WriteOption writeOption, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).removeOneWithOptions(collection, query, writeOption, resultHandler);
    return this;
  }

  public Observable<Void> removeOneWithOptionsObservable(String collection, JsonObject query, WriteOption writeOption) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    removeOneWithOptions(collection, query, writeOption, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService removeDocumentWithOptions(String collection, JsonObject query, WriteOption writeOption, Handler<AsyncResult<MongoClientDeleteResult>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).removeDocumentWithOptions(collection, query, writeOption, resultHandler);
    return this;
  }

  public Observable<MongoClientDeleteResult> removeDocumentWithOptionsObservable(String collection, JsonObject query, WriteOption writeOption) { 
    io.vertx.rx.java.ObservableFuture<MongoClientDeleteResult> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    removeDocumentWithOptions(collection, query, writeOption, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService createCollection(String collectionName, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).createCollection(collectionName, resultHandler);
    return this;
  }

  public Observable<Void> createCollectionObservable(String collectionName) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    createCollection(collectionName, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService getCollections(Handler<AsyncResult<List<String>>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).getCollections(resultHandler);
    return this;
  }

  public Observable<List<String>> getCollectionsObservable() { 
    io.vertx.rx.java.ObservableFuture<List<String>> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    getCollections(resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService dropCollection(String collection, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).dropCollection(collection, resultHandler);
    return this;
  }

  public Observable<Void> dropCollectionObservable(String collection) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    dropCollection(collection, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService createIndex(String collection, JsonObject key, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).createIndex(collection, key, resultHandler);
    return this;
  }

  public Observable<Void> createIndexObservable(String collection, JsonObject key) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    createIndex(collection, key, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService createIndexWithOptions(String collection, JsonObject key, IndexOptions options, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).createIndexWithOptions(collection, key, options, resultHandler);
    return this;
  }

  public Observable<Void> createIndexWithOptionsObservable(String collection, JsonObject key, IndexOptions options) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    createIndexWithOptions(collection, key, options, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService listIndexes(String collection, Handler<AsyncResult<JsonArray>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).listIndexes(collection, resultHandler);
    return this;
  }

  public Observable<JsonArray> listIndexesObservable(String collection) { 
    io.vertx.rx.java.ObservableFuture<JsonArray> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    listIndexes(collection, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService dropIndex(String collection, String indexName, Handler<AsyncResult<Void>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).dropIndex(collection, indexName, resultHandler);
    return this;
  }

  public Observable<Void> dropIndexObservable(String collection, String indexName) { 
    io.vertx.rx.java.ObservableFuture<Void> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    dropIndex(collection, indexName, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService runCommand(String commandName, JsonObject command, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).runCommand(commandName, command, resultHandler);
    return this;
  }

  public Observable<JsonObject> runCommandObservable(String commandName, JsonObject command) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    runCommand(commandName, command, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService distinct(String collection, String fieldName, String resultClassname, Handler<AsyncResult<JsonArray>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).distinct(collection, fieldName, resultClassname, resultHandler);
    return this;
  }

  public Observable<JsonArray> distinctObservable(String collection, String fieldName, String resultClassname) { 
    io.vertx.rx.java.ObservableFuture<JsonArray> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    distinct(collection, fieldName, resultClassname, resultHandler.toHandler());
    return resultHandler;
  }

  public MongoService distinctBatch(String collection, String fieldName, String resultClassname, Handler<AsyncResult<JsonObject>> resultHandler) { 
    ((io.vertx.ext.mongo.MongoClient) delegate).distinctBatch(collection, fieldName, resultClassname, resultHandler);
    return this;
  }

  public Observable<JsonObject> distinctBatchObservable(String collection, String fieldName, String resultClassname) { 
    io.vertx.rx.java.ObservableFuture<JsonObject> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    distinctBatch(collection, fieldName, resultClassname, resultHandler.toHandler());
    return resultHandler;
  }

  public void close() { 
    ((io.vertx.ext.mongo.MongoClient) delegate).close();
  }


  public static MongoService newInstance(io.vertx.ext.mongo.MongoService arg) {
    return arg != null ? new MongoService(arg) : null;
  }
}
