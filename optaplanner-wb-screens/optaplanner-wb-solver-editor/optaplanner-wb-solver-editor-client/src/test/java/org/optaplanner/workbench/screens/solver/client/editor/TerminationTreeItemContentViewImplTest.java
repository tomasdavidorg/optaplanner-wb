/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.workbench.screens.solver.client.editor;

import com.google.gwtmockito.GwtMockitoTestRunner;
import com.google.gwtmockito.WithClassesToStub;
import org.gwtbootstrap3.client.ui.AnchorListItem;
import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.DropDownMenu;
import org.gwtbootstrap3.client.ui.base.AbstractAnchorListItem;
import org.gwtbootstrap3.client.ui.html.Text;
import org.jboss.errai.ui.client.local.spi.TranslationService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

@RunWith(GwtMockitoTestRunner.class)
@WithClassesToStub({ Text.class, AnchorListItem.class, AbstractAnchorListItem.class })
public class TerminationTreeItemContentViewImplTest {

    @Mock
    private DropDownMenu dropDownMenu;

    @Mock
    private Button removeTerminationButton;

    @Mock
    private TranslationService translationService;

    private TerminationTreeItemContentViewImpl view;

    @Before
    public void setUp() {
        view = new TerminationTreeItemContentViewImpl( removeTerminationButton,
                                                       dropDownMenu,
                                                       translationService );
    }

    @Test
    public void initDropDownList() {
        verify( dropDownMenu,
                atLeastOnce() ).add( any() );
    }
}
