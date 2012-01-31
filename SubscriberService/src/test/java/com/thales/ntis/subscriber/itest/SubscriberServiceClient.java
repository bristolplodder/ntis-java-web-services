/*
	Copyright (C) 2011 Thales Transportation Systems UK
	Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), 
	to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
	and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
	The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS 
	IN THE SOFTWARE.
 */

package com.thales.ntis.subscriber.itest;

import com.thales.ntis.subscriber.datex.DeliverANPRTrafficDataRequest;
import com.thales.ntis.subscriber.datex.DeliverANPRTrafficDataResponse;
import com.thales.ntis.subscriber.datex.DeliverAverageJourneyTimeRequest;
import com.thales.ntis.subscriber.datex.DeliverAverageJourneyTimeResponse;
import com.thales.ntis.subscriber.datex.DeliverAverageSpeedFusedDataRequest;
import com.thales.ntis.subscriber.datex.DeliverAverageSpeedFusedDataResponse;
import com.thales.ntis.subscriber.datex.DeliverAverageSpeedFvdRequest;
import com.thales.ntis.subscriber.datex.DeliverAverageSpeedFvdResponse;
import com.thales.ntis.subscriber.datex.DeliverFusedDataPublicationRequest;
import com.thales.ntis.subscriber.datex.DeliverFusedDataPublicationResponse;
import com.thales.ntis.subscriber.datex.DeliverMIDASTrafficDataRequest;
import com.thales.ntis.subscriber.datex.DeliverMIDASTrafficDataResponse;

public interface SubscriberServiceClient {

	public DeliverAverageSpeedFusedDataResponse invokeService(
			DeliverAverageSpeedFusedDataRequest request);

	public DeliverAverageSpeedFvdResponse invokeService(
			DeliverAverageSpeedFvdRequest request);

	public DeliverAverageJourneyTimeResponse invokeService(
			DeliverAverageJourneyTimeRequest request);

	public DeliverFusedDataPublicationResponse invokeService(
			DeliverFusedDataPublicationRequest request);

	public DeliverMIDASTrafficDataResponse invokeService(
			DeliverMIDASTrafficDataRequest request);

	public DeliverANPRTrafficDataResponse invokeService(
			DeliverANPRTrafficDataRequest request);

}