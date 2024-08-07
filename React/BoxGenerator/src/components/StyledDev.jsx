import React from 'react';
import styled from 'styled-components';

const StyledBox = styled.div`
    border: 1px solid lightgray;
    background: ${props => props.bgColor};
    width: ${props => props.width +"px"|| '100px'};
    height: ${props => props.height +"px" || '100px'};
    margin:10px;
`;

export default StyledBox;