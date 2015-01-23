/*
 * Copyright 2012 Netflix, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package zookeeper.recipes.cache;

class EventOperation implements Operation
{
    private final PathChildrenCache cache;
    private final PathChildrenCacheEvent event;

    EventOperation(PathChildrenCache cache, PathChildrenCacheEvent event)
    {
        this.cache = cache;
        this.event = event;
    }

    @Override
    public void invoke()
    {
        cache.callListeners(event);
    }

    @Override
    public String toString()
    {
        return "EventOperation{" +
            "event=" + event +
            '}';
    }
}
