/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.l2switch.packethandler.decoders;


import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.basepacket.rev140528.Packet;
import org.opendaylight.yangtools.yang.binding.Notification;

/**
 * PacketDecoder should be implemented by all the decoders that are going to decode any Packet.
 * E.g. LLDPDecoder, ARPDecoder etc.
 */
public interface PacketDecoder {

  /**
   * Decodes the payload in given Packet further and returns a extension of Packet.
   * e.g. ARP, IPV4, LLDP etc.
   *
   * @param packet
   * @return
   */
  public Packet decode(Packet packet);

  /**
   * This is utility method for converting the decoded packet to its corresponding notification.
   *
   * @param decodedPacket
   * @return
   */
  public Notification buildPacketNotification(Packet decodedPacket);
}
