/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.flowable.engine.impl.persistence.entity;

import java.util.Date;

import org.flowable.engine.common.impl.db.HasRevision;
import org.flowable.engine.common.impl.persistence.entity.Entity;
import org.flowable.engine.task.Attachment;

/**
 * @author Joram Barrez
 */
public interface AttachmentEntity extends Attachment, Entity, HasRevision {

    void setType(String type);

    void setTaskId(String taskId);

    void setProcessInstanceId(String processInstanceId);

    void setUrl(String url);

    void setContentId(String contentId);

    ByteArrayEntity getContent();

    void setContent(ByteArrayEntity content);

    void setUserId(String userId);

    @Override
    String getUserId();

    @Override
    Date getTime();

    @Override
    void setTime(Date time);

}
